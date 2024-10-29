grammar comp24;

@header {
package com.example;
}

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
OPERADOR_BINARIO : '+' | '-' | '*' | '/' | '%' | '^' ;
COMPARACION : '==' | '!=' | '<' | '>' | '<=' | '>=' ;

//OPERADOR_ASIGNACION : '+=' | '-=' | '*=' | '/=' | '%=' | '^=' ;
// TYPE: 'int' | 'double' | 'char' | 'void' ; // QUESTO è SCORRETTO PERCHè QUESTA è UNA ESPRESSIONE REGOLARE, MENTRE IL tdato è UNA REGOLA GRAMMATICALE

WS : [ \t\n\r] -> skip ;
COMENTARIO : '//' ~[\r\n]* -> skip ;

/*
 *
 * DEFINICIóN DE LAS REGLAS GRAMáTICALES
 *
 */


programa : instrucciones EOF ; // regla inicial

instrucciones : instruccion instrucciones
              | 
              ;

instruccion : declaraciones
            | while
            | bloque
            | asignaciones
            | funcion_prototipo
            | funcion_definicion
            | funcion_llamada
            | if_instruccion
            | for
            | exp
            | opal
            | return
            ;

bloque : LLA instrucciones LLC ;

tdato : INT
      | DOUBLE
      | CHAR
      | VOID
      ;




/*
 * OPERACIONES ARTIMETICAS Y LOGICAS
 */

opales : opal COMA opales
       | opal
       ;

// orden de las operacciones logicas: !, comparaciones, &&, ||
opal : NOT opal
     | PA opal PC
     | opal AND opal
     | opal OR opal
     | opal COMPARACION opal
     | exp
     ;

exp : term e ; // exp es una operacion aritmetica, por ejemplo: a + b / (c + d)

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

factor : PA exp PC
       | ID OPERADOR_UNARIO // mia aggiunta
       | OPERADOR_UNARIO ID // mia aggiunta
       | NUMERO
       | ID
       | <assoc=right> RESTA factor
       | func_llamada
       ;




/*
 * CONSTRUCCIONES CONDICIONALES
 */

if_instruccion : IF PA opal PC instruccion else_instruccion ;

else_instruccion : ELSE IF PA opal PC instruccion else_instruccion
                   | ELSE instruccion 
                   | ;




/*
 * CONSTRUCCIONES ITERATIVAS
 */

while : WHILE PA (opal | ID) PC instruccion ; 

for : FOR PA acciones_iniciales? PYC acciones_siempre? PYC acciones_post? PC instruccion? ;

acciones_iniciales : accion_inicial COMA acciones_iniciales
                   | accion_inicial
                   ;

accion_inicial : opales
               | decl
               //| numeros  // questa riga è stata rimossa perchè i numeri nel for vengono catalogati come una opal che ha solo un factor. Nel caso in cui sia necessario reintrodurli, fare in modo di mettere "numeros" per primo e di metterlo in esclusione con "opal" e con "decl"
               ;

acciones_siempre : accion_siempre COMA acciones_siempre
                 | accion_siempre
                 ;

accion_siempre : opales
               | decl
               ;

acciones_post : accion_post COMA acciones_post
              | accion_post
              ;

accion_post : opales
            | decl
            ;




/*
 * DECLARACIONES Y ASIGNACIONES
 */

declaraciones : tdato decl PYC;

decl : declaracion COMA decl
      | asign COMA decl // | asignaciones COMA decl   VERSIONE PRECEDENTE FUNZIONANTE
      //| funcion_definicion COMA decl
      | asign // | asignaciones   VERSIONE PRECEDENTE FUNZIONANTE
      | declaracion
      //| funcion_definicion
      ;

declaracion : ID;

/* VERSIONE PRECEDENTE FUNZIONANTE
asignaciones : ID ASIGN asignaciones
             | asignacion PYC?
             | func_call
             ;
*/

asignaciones : asign PYC;

asign : ID ASIGN asign
             | asignacion
             | func_llamada
             ;

asignacion : ID ASIGN (opal | ID | NUMERO) 
           /*| ID OPERADOR_UNARIO
           | OPERADOR_UNARIO ID
           | ID OPERADOR_ASIGNACION (opal | ID | NUMERO)
           */;




/*
 * FUNCIONES
 */

funcion_prototipo : tdato ID PA argumentos? PC PYC ;

funcion_definicion : tdato ID PA argumentos? PC bloque ;

argumentos : argumento COMA argumentos
           | argumento
           ;

argumento : tdato ID ;

funcion_llamada : func_llamada PYC ;

func_llamada : ID PA parametros? PC;

parametros : parametro COMA parametros
           | parametro
           ;

parametro : opal
          | ID
          | NUMERO
          ;




/*
 * RETURN
 */

return : RETURN PYC
        | RETURN opal PYC
        ;