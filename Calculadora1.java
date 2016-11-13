import java.util.Scanner;

public class Calculadora1{

public static void main(String args[]){
int a=0;
int c=0;
int d=0;
int e=0;
int f=0;
int g=0;
int h=0;
int i=0;
int j=0;
do{
do{
System.out.println("Eliga la opcion que desea realizar");
System.out.println("1. Suma de 2 numeros");
System.out.println("2. Resta de 2 numeros");
System.out.println("3. Multiplicación de 2 numeros");
System.out.println("4. División de 2 numeros");
System.out.println("5. Ver Bitácora");
System.out.println("6. Borrar Bitácora");
System.out.println("7. Salir");

Scanner opcion1= new Scanner(System.in);
a= opcion1.nextInt();
}while(a<1||a>7);


switch(a) {

case 1:

System.out.println("Ingrese primer digito a operar");

Scanner dato1suma= new Scanner(System.in);
c= dato1suma.nextInt();

System.out.println("Ingrese Segundo digito a operar");

Scanner dato2suma= new Scanner(System.in);
d= dato2suma.nextInt();

System.out.println(c+" + "+d+" = "+(c+d));

break;

case 2:

System.out.println("Ingrese primer digito a operar");

Scanner dato1resta= new Scanner(System.in);
e= dato1resta.nextInt();

System.out.println("Ingrese Segundo digito a operar");

Scanner dato2resta= new Scanner(System.in);
f= dato2resta.nextInt();

System.out.println(e+" - "+f+" = "+(e-f));

break;

case 3:

System.out.println("Ingrese primer digito a operar");

Scanner dato1multiplicacion= new Scanner(System.in);
g= dato1multiplicacion.nextInt();

System.out.println("Ingrese Segundo digito a operar");

Scanner dato2multiplicacion= new Scanner(System.in);
h= dato2multiplicacion.nextInt();

System.out.println(g+" * "+h+" = "+(g*h));

break;

case 4:

System.out.println("Ingrese primer digito a operar");

Scanner dato1division= new Scanner(System.in);
i= dato1division.nextInt();

System.out.println("Ingrese Segundo digito a operar");

Scanner dato2division= new Scanner(System.in);
j= dato2division.nextInt();
if(j!=0){

System.out.println(i+" / "+j+" = "+(i/j));

}else{
System.out.println("Division entre 0 no es permitida");}

break;

case 7:
System.exit(0);

break;

default:

System.out.println("NO INGRESO UNA DE LAS OPCIONES");
}
}while(a!=7);



}

}


