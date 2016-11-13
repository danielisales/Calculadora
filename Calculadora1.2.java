
import java.util.Scanner;

	public class Calculadora1.2 {

    
    		public static void main(String[] args)  {

int a=0;
int c=0;
int d=0;
int e=0;
int f=0;
int g=0;
int h=0;
int i=0;
int j=0;
int r=0;
String [] historial= new String[30];
String d1;
String d2;
String d3;
String registro;
int contador=0;

	do{

System.out.println("Menu de operaciones aritmeticas");
System.out.println("1. Suma de 2 numeros");
System.out.println("2. Resta de 2 numeros");
System.out.println("3. Multiplicación de 2 numeros");
System.out.println("4. División de 2 numeros");
System.out.println("5. Ver Bitácora");
System.out.println("6. Borrar Bitácora");
System.out.println("7. Salir");
System.out.println("Elija una opcion");

	Scanner opcion1= new Scanner(System.in);
	a= opcion1.nextInt();

for(int o=0;o<=24;o++){
System.out.println();
}


	switch(a) {

		case 1:

System.out.println("Ingrese primer digito a operar");

Scanner dato1suma= new Scanner(System.in);
c= dato1suma.nextInt();

System.out.println("Ingrese Segundo digito a operar");

Scanner dato2suma= new Scanner(System.in);
d= dato2suma.nextInt();

r=c+d;

System.out.println(c+" + "+d+" = "+r);


d1=String.valueOf(c);
d2=String.valueOf(d);
d3=String.valueOf(r);
registro=d1+"+"+d2+"="+r;
historial[contador]=registro;
contador++;
System.out.println("----------------------------------------------");

	break;

		case 2:

System.out.println("Ingrese primer digito a operar");

Scanner dato1resta= new Scanner(System.in);
e= dato1resta.nextInt();

System.out.println("Ingrese Segundo digito a operar");

Scanner dato2resta= new Scanner(System.in);
f= dato2resta.nextInt();

r=e-f;

System.out.println(e+" - "+f+" = "+r);

d1=String.valueOf(e);
d2=String.valueOf(f);
d3=String.valueOf(r);
registro=d1+"+"+d2+"="+r;
historial[contador]=registro;
contador++;
System.out.println("----------------------------------------------");
	break;

		case 3:

System.out.println("Ingrese primer digito a operar");

Scanner dato1multiplicacion= new Scanner(System.in);
g= dato1multiplicacion.nextInt();

System.out.println("Ingrese Segundo digito a operar");

Scanner dato2multiplicacion= new Scanner(System.in);
h= dato2multiplicacion.nextInt();

r=g*h;

System.out.println(g+" * "+h+" = "+r);


d1=String.valueOf(g);
d2=String.valueOf(h);
d3=String.valueOf(r);
registro=d1+"+"+d2+"="+r;
historial[contador]=registro;
contador++;
System.out.println("----------------------------------------------");
	break;

		case 4:

System.out.println("Ingrese primer digito a operar");

Scanner dato1division= new Scanner(System.in);
i= dato1division.nextInt();

System.out.println("Ingrese Segundo digito a operar");

Scanner dato2division= new Scanner(System.in);
j= dato2division.nextInt();

	if(j!=0){

r=i/j;

System.out.println(i+" / "+j+" = "+r);

d1=String.valueOf(i);
d2=String.valueOf(j);
d3=String.valueOf(r);
registro=d1+"+"+d2+"="+r;
historial[contador]=registro;
contador++;
System.out.println("----------------------------------------------");

	}else{
System.out.println("Division entre 0 no es permitida");}

	break;

		case 5:

System.out.println("----------------------------------------------");
System.out.println("BITACORA DE OPERACIONES");
System.out.println("----------------------------------------------");

int x=0;
while(x!=contador){
System.out.println(x+"->"+historial[x]);
x++;
    }
System.out.println("----------------------------------------------");
	break;

		case 6:

System.out.println("----------------------------------------------");
System.out.println("BITACORA DE OPERACIONES");
System.out.println("----------------------------------------------");
System.out.println("¿Esta seguro que desea borrar la bitacora?");
System.out.println("Presione \"1\" si es si");
System.out.println("Presione \"2\" si es no");
int m=0;
Scanner borrar=new Scanner(System.in);
m=borrar.nextInt();

switch(m){

case 1:
int y=0;
while(y!=contador){
historial[y]="";
y++;
System.out.println("Datos borrados Exitosamente");}
break;

case 2:
System.out.println("puede continuar");
break;
}

System.out.println("----------------------------------------------");




	break;


		case 7:

System.exit(0);

	break;

		default:

System.out.println("NO INGRESO NINGUNA DE LAS OPCIONES");

}

System.out.println("Preciona tecla para continuar");
opcion1.next();

for(int z=0;z<=24;z++){
System.out.println();
}


}	
while(a!=7);



}
               
}
