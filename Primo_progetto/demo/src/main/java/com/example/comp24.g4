grammar comp24;

@header {
package com.example;
}



/*
 *
 * DEFINICIÓN DE LAS EXPRESIONES REGULARES
 *
 */



// fragment dice di non catturare un simbolo, perchè mi serve catturarlo per creare una regular expression (definite come ID, NUMERO, OTRO)
fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

FOR : 'for' ;
IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
RETURN : 'return' ;

INT : 'int' ;
DOUBLE : 'double' ;
CHAR : 'char' ;
VOID : 'void' ;

COMA : ',' ;
PA : '(' ;
PC : ')' ;
LLA : '{' ;
LLC : '}' ;
ASIGN : '=' ;
PYC : ';' ;
SUMA : '+' ;
RESTA: '-' ;
MULT : '*' ;
DIV : '/' ;
MOD : '%' ;
AND: '&&' ;
OR: '||' ;
NOT: '!' ;

NUMERO : DIGITO+ ;
ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;
OPERADOR_UNARIO : '++' | '--' ;
COMPARACION : '==' | '!=' | '<' | '>' | '<=' | '>=' ;

WS : [ \t\n\r] -> skip ;
COMENTARIO : '//' ~[\r\n]* -> skip ;



/*
 *
 * DEFINICIÓN DE LAS REGLAS GRAMÁTICALES
 *
 */



programa : instrucciones EOF ; // REGLA INICIAL

instrucciones : instruccion instrucciones
              | 
              ;

instruccion : bloque
            | declaracion PYC
            | asignacion PYC
            | funcion_prototipo
            | funcion_definicion
            | funcion_llamada
            | if_instruccion
            | for
            | while
            | opal PYC
            | exp
            | return
            ;

bloque : LLA instrucciones LLC ;

tdato : INT
      | DOUBLE
      | CHAR
      | VOID
      ;




/*
 * OPERACIONES ARTIMETICO-LOGICAS
 * orden de las operacciones logicas: !, comparaciones, &&, ||
 */

opal : or_expr ;

or_expr : and_expr o ;

o : OR and_expr o
  | 
  ;

and_expr : not_expr a ;

a : AND not_expr a
  | 
  ;

not_expr : NOT not_expr
         | PA opal PC // evaluación: creo que no hay manera de substituirlo
         | comp
         ;

comp : exp co;

co : COMPARACION exp
   |
   ;




/*
 * OPERACIONES ARTIMETICAS
 */

exp : term e ;

e: SUMA term e
 | RESTA term e
 |
 ;

term : factor t ;

t: MULT factor t
 | DIV factor t
 | MOD factor t
 |
 ;

factor : PA exp PC  // evaluación: creo que no hay manera de substituirlo
       | ID OPERADOR_UNARIO
       | OPERADOR_UNARIO ID
       | NUMERO
       | ID
       | <assoc=right> RESTA factor
       | func_llamada
       ;




/*
 * CONSTRUCCIONES CONDICIONALES
 */

if_instruccion : IF PA opal PC instruccion else_instruccion ;

else_instruccion : ELSE instruccion 
                 |
                 ;




/*
 * CONSTRUCCIONES ITERATIVAS
 */

while : WHILE PA opal PC instruccion ;

for : FOR PA accion_inicial PYC accion_siempre PYC accion_post PC instruccion ;

accion_inicial : asignacion
               |
               ;

accion_siempre : opal
               |
               ;

accion_post : asignacion
            | opal
            |
            ;




/*
 * DECLARACIONES Y ASIGNACIONES
 */

declaracion : tdato ID inicializacion list_decl ;

inicializacion : ASIGN opal
               |
               ;

list_decl : COMA ID inicializacion list_decl
          |
          ;

asignacion : ID ASIGN opal ;




/*
 * FUNCIONES
 */

funcion_prototipo : tdato ID PA argumento lista_argumentos PC PYC ;

funcion_definicion : tdato ID PA argumento lista_argumentos PC bloque ;

lista_argumentos : COMA argumento lista_argumentos
                 |
                 ;

argumento : tdato ID
          |
          ;

funcion_llamada : func_llamada PYC ;

func_llamada : ID PA parametro lista_parametros PC;

lista_parametros : COMA parametro lista_parametros
                 |
                 ;

parametro : opal 
          |
          ;




/*
 * RETURN
 */

return : RETURN PYC
       | RETURN opal PYC
       ;