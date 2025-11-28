import java.util.Scanner;

public class lavadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Que Tipo De Lavadora Desea");
            System.out.println("Seleccione Una Opcion");
            System.out.println("1. Lavadora Estandar");
            System.out.println("2. Lavadora Grande");
            System.out.println("3. Lavadora Industrial");
            opcion = sc.nextInt();
            if (opcion > 3){
                System.out.print("Has marcado un dato incorrecto elige de nuevo\n");
            } else {
                System.out.print("Bien Echo\n");
            }
        }while (opcion > 3 );
            switch (opcion) {
                case 1: { // Lavadora Estandar
                    System.out.print("Has elegido Lavadora Estandar\n");
                    System.out.print("Ingrese El Numero De Horas\n");
                    int horas = sc.nextInt();
                    if (horas == 3) {
                        System.out.print("Debes pagar: $ 15000");
                    } else if (horas > 3) {
                        int ayuda = horas - 3;
                        int valor = (ayuda * 4000) + 15000;
                        System.out.print("Debes pagar: $" + valor);
                    } else {
                        System.out.print("ERROR EN INGRESAR LAS HORAS");
                    }
                    break;
                }

                case 2: {// Lavadora grande
                    System.out.print("Has elegido Lavadora Grande\n");
                    System.out.print("Ingrese El Numero De Horas\n");
                    int horas1 = sc.nextInt();
                    if (horas1 == 3) {
                        System.out.print("Debes pagar: $ 21000");
                    } else if (horas1 > 3) {
                        int ayuda = horas1 - 3;
                        int valor = (ayuda * 6000) + 21000;
                        System.out.print("Debes pagar: $" + valor);
                    } else {
                        System.out.print("ERROR EN INGRESAR LAS HORAS");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Has elegido Lavadora Industrial\n");
                    System.out.print("Ingrese El Numero De Horas\n");
                    int horas2 = sc.nextInt();
                    if (horas2 == 3) {
                        System.out.print("Debes pagar: $ 30000");
                    } else if (horas2 > 3) {
                        int ayuda = horas2 - 3;
                        int valor = (ayuda * 8000) + 30000;
                        System.out.print("Debes pagar: $" + valor);
                    } else {
                        System.out.print("ERROR EN INGRESAR LAS HORAS");
                    }
                    break;
                }
                default:
                    System.out.print("INGRESASTE UN DATOS ERRONEO");

            }
        }
    }
