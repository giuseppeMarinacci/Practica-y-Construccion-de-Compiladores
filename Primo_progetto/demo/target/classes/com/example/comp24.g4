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
LLA : '{' ; // llave que abre
LLC : '}' ; // llave que cerra
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

// LINEA : ( LETRA | DIGITO | [ {}=;+*] )*'\n' ;
ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;
OPERADOR_UNARIO : '++' | '--' ;
OPERADOR_BINARIO : '+' | '-' | '*' | '/' | '%' | '^' ;
//OPERADOR_ASIGNACION : '+=' | '-=' | '*=' | '/=' | '%=' | '^=' ;
COMPARACION : '==' | '!=' | '<' | '>' | '<=' | '>=' ;
// TYPE: 'int' | 'double' | 'char' | 'void' ; // QUESTO è SCORRETTO PERCHè QUESTA è UNA ESPRESSIONE REGOLARE, MENTRE IL tdato è UNA REGOLA GRAMMATICALE
NUMERO : DIGITO+ ;

WS : [ \t\n\r] -> skip ;

/*OTRO : . ;

s : ID { System.out.println("ID->" + $ID.getText() + "<--"); } s
  | NUMERO { System.out.println("NUMERO->" + $NUMERO.getText() + "<--"); } s
  | OTRO { System.out.println("OTRO->" + $OTRO.getText() + "<--"); } s
  | DIGITO { System.out.println("DIGITO->" + $DIGITO.getText() + "<--"); } s
  | EOF
;

si : s EOF ;

s : PA s PC s
  |
  ;

*/

programa : instrucciones EOF ; // regla inicial o start rule

instrucciones : instruccion instrucciones
              | 
              ;

instruccion : declaraciones
            | while
            | bloque
            | asignaciones
            | funcion_decl
            | funcion_call
            | if
            | for
            | exp
            | opal
            | return
            ;

bloque : LLA instrucciones LLC ;

while : WHILE PA (opal | ID) PC instruccion ; 

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
       | func_call
       ;


// mis incorporaciones

// orden de las operacciones logicas: !, comparaciones, &&, ||
opal : NOT opal
     | opal COMPARACION opal
     | opal AND opal
     | opal OR opal
     | PA opal PC
     | exp
     ;

if : IF PA opal PC (instruccion | instruccion ELSE instruccion) ;

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

opales : opal COMA opales
       | opal
       ;

tdato : INT
      | DOUBLE
      | CHAR
      | VOID
      ;

declaraciones : tdato decl PYC;

decl : declaracion COMA decl
      | asign COMA decl // | asignaciones COMA decl   VERSIONE PRECEDENTE FUNZIONANTE
      | funcion_decl COMA decl
      | asign // | asignaciones   VERSIONE PRECEDENTE FUNZIONANTE
      | declaracion
      | funcion_decl
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
             | func_call
             ;

asignacion : ID ASIGN (opal | ID | NUMERO) 
           /*| ID OPERADOR_UNARIO
           | OPERADOR_UNARIO ID
           | ID OPERADOR_ASIGNACION (opal | ID | NUMERO)
           */;

// funcion_decl es necesario para las declaraciones de las funciones
funcion_decl : ID PA argumentos? PC bloque ;

argumentos : argumento COMA argumentos
           | argumento
           ;

argumento : tdato ID ;

funcion_call : func_call PYC ;

func_call : ID PA parametros? PC;

parametros : parametro COMA parametros
           | parametro
           ;

parametro : opal
          | ID
          | NUMERO
          ;

return : RETURN PYC
        | RETURN opal PYC
        ;