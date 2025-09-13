import Entidades.Libro;

import java.util.Scanner;

public class Main {
    //Punto Uno
    /* 1.- Realizar un programa que lee por teclado el valor
           del radio de una circunferencia, calcula y muestra
           por pantalla la longitud y el área de la circunferencia.
           Cálculo de longitud: 2 * PI * radio, cálculo de área: PI * radio^2.
           Usar la clase Math.
    */
    public static void puntoUno(){
        Scanner sc = new Scanner(System.in);
        System.out.println("este seria el ejercicio1");
        int radioIngresado = sc.nextInt();
        double longitud = 2 *  Math.PI * radioIngresado;
        double areaCircunferencia = Math.PI * Math.pow(radioIngresado, 2);
        System.out.println("el longitud es: " + longitud);
        System.out.println("el area es: " + areaCircunferencia);
    };

    /* 2.- Realizar un programa que lea la longitud de los catetos
           de un triángulo rectángulo y calcule la longitud de la hipotenusa
           según el teorema de Pitágoras. Usar la clase Math.
    */
    public static void puntoDos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la medida del primer cateto: ");
        int catetoUno =  sc.nextInt();
        System.out.println("Ingrese la medida del segundo cateto: ");
        int catetoDos = sc.nextInt();
        double hipotenusa = Math.sqrt(Math.pow(catetoUno, 2) + Math.pow(catetoDos, 2));
        System.out.println("El resultado es: " + hipotenusa);
    }

    /* 3.- Realizar un programa que calcula el volumen de una esfera.
           El valor de radio se debe pedir por teclado.
           Cálculo: volumen = 4/3 * PI * radio^3. Usar la clase Math.
    */
    public static void puntoTres(){
        System.out.println("Ingrese el radio de la esfera: ");
        Scanner sc = new Scanner(System.in);
        int radioIngresardo = sc.nextInt();
        double volumenEsfera = 4/3 * Math.PI * Math.pow(radioIngresardo, 3);
        System.out.println("El volumen es: " + volumenEsfera);
    }

    /* 4.- El punto del libro*/
    public static void puntoCuatro(){
        Scanner sc = new Scanner(System.in);
        Libro libroUno = new Libro("Don Quijote", "Miguel de Cervantes", 500, 10);
        Libro libroDos = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 700, 5);
        System.out.println("libro uno.- " + libroUno);
        System.out.println("libro dos.- " + libroDos);
        System.out.println("Vendiendo 3 libros UNO");
        libroUno.Vender(3);
        System.out.println("libro uno.- " + libroUno);
        System.out.println("Vendiendo 8 libros DOS");
        libroDos.Vender(8);
        System.out.println("libro dos.- " + libroDos);
        libroDos.AumentarCantidad(5);
        System.out.println("libro dos.- " + libroDos);
    }

    public static void main(String[] args) {



        System.out.printf("Hello bienvenido a la guia 4!");
        boolean seguir = true;
        while (seguir) {
            int opcion;
            System.out.println("1.- Calcular longitud y area de una circunferencia.");
            System.out.println("2.- Calcular Hipotenusa.");
            System.out.println("3.- Calcular Volumen de una Esfera");
            System.out.println("4.  Libro.");
            System.out.println("0.- Salir.");
            System.out.println("Ingrese la opcion que desea: ");

            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1: {
                    puntoUno();
                    break;
                }
                case 2: {
                    puntoDos();
                    break;
                }
                case 3: {
                    puntoTres();
                    break;
                }
                case 4:{
                    puntoCuatro();
                    break;
                }
                case 0: {
                    seguir = false;
                    System.out.println("Dale, nos vemos!");
                    break;
                }
                default: {
                    System.out.println("Ingrese una opcion valida!");
                    break;
                }

            }
        }
    }
}