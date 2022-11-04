
package ultimotry.examenfinal.labipc1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class UltimoTryExamenFinalLabIPC1 {


 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         boolean salir = false;
         int opcion;
         while(!salir){
             System.out.println("\n");
             System.out.println("\n");
            System.out.println("Biembenido Al Examen Final");
            System.out.println("\n");
            System.out.println("1. Ejercicio 1");     
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Salir");
            
             System.out.println("Ingrese el dato del ejercicio que desee: ");
             opcion = sc.nextInt();
             
             switch(opcion){
                 //EJERCICIO 1
               case 1:
                System.out.println("Has seleccionado el ejercicio 1");

		int n1,n2;
		System.out.print("Introduce un numero: ");
		n1=sc.nextInt();
		System.out.print("Introduce otro numero: ");
		n2=sc.nextInt();
		if(n1==n2)
		 System.out.println("Son iguales");
		else
		 {
			if(n1>n2)
				System.out.println(n1 + " es mayor que " + n2);
			else
				System.out.println(n2 + " es mayor que " + n1);
		 } 
                   break;
                   
                   
                   //EJERCICIO 2
               case 2:
                   System.out.println("Has seleccionado el ejercicio 2");
                   
                 System.out.print("Introduzca numero de filas impar: ");
                 int numFilas = sc.nextInt();
                 
                System.out.println();
                for(int altura = 1; altura<=numFilas; altura++){
                //Espacios en blanco
                for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(" ");
                }
                //Asteriscos
                for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
                }
                 System.out.println();
                }
                   break;
                   
                   //EJERCICIO 3
                case 3:
                   System.out.println("Has seleccionado el ejercicio 3");
                   System.out.println("\n");
                   List list = new ArrayList();
                   list.add(1);
                   list.add(2);   
                   list.add(3);
                   list.add(4);
                   list.add(5);
                   list.add(6);
                   list.add(7);
                   list.add(8);
                   
                   List lst = new ArrayList();
                   lst.add(223);
                   lst.add(243);
                   lst.add(100);
                   lst.add(200);
                   lst.add(200);
                   lst.add(155);
                   lst.add(300);
                   lst.add(150);
                   
                   
                   List prod = new ArrayList();
                   prod.add(30);
                   prod.add(34);
                   prod.add(28);
                   prod.add(45);
                   prod.add(31);
                   prod.add(50);
                   prod.add(29);
                   prod.add(1);
                   
                    System.out.println(list);
                    System.out.println(lst);
                    System.out.println(prod);
                    
                  
                   break;
                case 4:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
           }
       } 
             
        }  
    }



       
         
         
         
        

  