package lab3p1_víctorromero;

import java.util.Scanner;

public class Lab3P1_VíctorRomero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("___________________________________________________________________________ ");
            System.out.println(" ");
            System.out.println(">> MENU <<");
            System.out.println("----------------------- ");

            System.out.println("1) EJERCICIO 1 - Diptongo ");
            System.out.println("2) EJERCICIO 2 - Sumatoria");
            System.out.println("3) EJERCICIO 3 - TimeClock");
            System.out.println("4) SALIDA");
            System.out.println(" ");
            System.out.println(" ");

            System.out.print(">> Ingrese la Opcion del Menu: ");
            opcion = leer.nextInt();
            System.out.println("=> La Opcion escojida es: " + opcion);
            System.out.println(" ");

            switch (opcion) {

                case 1: {
                    System.out.println(".: OPCION 1 :.");
                    System.out.println("DIPTONGO EN CURSO...");
                    System.out.println(" ");

                    String palabra, palabra2;
                    System.out.print(">Ingrese una palabra: ");
                    palabra = leer.next().toLowerCase();

                    System.out.println(" ");
                    System.out.println(">>LA PALABRA ESCRITA ES: " + palabra);

                    int diptongo = 0;
                    for (int i = 0; i < palabra.length(); i++) { // PALABRA LENGHT NUMERO DE LETRAS
                        char letra = palabra.charAt(i);// INDICAR CHAR

                        switch (letra) {
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                                diptongo++;
                                break;

                            default:
                                diptongo = 0;
                        }
                        if (diptongo == 2) {
                            break;
                        }
                    }
                    if (diptongo == 2) {
                        System.out.println("ES UN DIPTONGO");
                    } else {
                        System.out.println("NO ES UN DIPTONGO");
                    }
                }
                break;// FIN OPCION 1___________________________________________

                case 2: {
                    System.out.println(" .: OPCION 2 :. ");
                    System.out.println("OPCION SUMATORIA EN CURSO...");

                    double k;
                    double y = 0.0;
                    double base = -1;
                    double div = 0.0;
                    double pi = 0.0;
                    double suma = 0;

                    System.out.println(" ");
                    System.out.print("> Ingrese el LIMITE de la Sumatoria: ");
                    k = leer.nextInt();

                    while (k < 0 || k == 0) {
                        System.out.println("NUMERO NO VALIDO - ERROR 404!");
                        System.out.print("> Ingrese un numero POSITIVO:  ");
                        k = leer.nextInt();
                        System.out.println(" ");
                    }

                    for (double n = 0; n < k; n++) {
                        y = Math.pow(base, n);
                        div = (y) / (2 * n + 1);
                        suma = suma + div;
                    }

                    pi = 4 * suma;

                    System.out.println(">> EL RESULTADO DE LA SUMATORIA ES: " + pi);
                }
                break;

                case 3: {
                    System.out.println(".: OPCION 3 :.");
                    System.out.println("TIME CLOCK EN CURSO...");
                    System.out.println(" ");

                    int base = 0;

                    System.out.print("> Ingrese la Ancho IMPAR: ");
                    base = leer.nextInt();

                    while (base % 2 == 0) {
                        System.out.println("> Ingrese un Numero IMPAR Valido: ");
                        base = leer.nextInt();
                    }

                    System.out.print(" ");
                    System.out.print(" ");
                    System.out.println("- El Triangulo con base " + base + " es: ");

//                    for (int j = 1; j <= base; j++) {
//                            for (int i = 1; i <= base - j; i++) {
//                                System.out.print("*  ");
//                            }// For Interno
//
//                            for (int v = 1; v <= j; v++) {
//                                System.out.print(" ");
//                            }
//                            for (int i = 1; i < base; i++) {
//                                for (int v = 1; v <= base - i; v++) {
//                                System.out.print(" ");
//                                }// For Interno
//
//                            for (int v = 1; v <= j; v++) {
//                                System.out.print("* ");
//                            }
//                            }
//                    }
                    int v = ((base +1)/2)-1;
                    for (int i = 0; i < (base+1)/2-1; i++) {
                        for (int j = 0; j < base; j++) {
                            
                            if ((j >= i) && (j < base - i)) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println(" ");
                    }
                   // System.out.println("hola");
                   
                    for (int i = 0; i < (base+1)/2; i++) {
                        for (int j = 0; j < base; j++) {
                            if (j==v||(j>=v-i&&j<=v+i)) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println(" ");
                    }
//                    for (int j = 1; j <= base; j++) {
//                            System.out.print("*");
//                            for (int i = 1; i <= base - j; i++) {
//                                System.out.print(" ");
//                            }// For Interno
//
//                            for (int v = 1; v <= j; v--) {
//                                System.out.print("*");
//                            }
//                            System.out.println(" ");
                }

            }

        } while (opcion != 4);
    }
}
