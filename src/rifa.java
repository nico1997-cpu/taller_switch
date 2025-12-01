import java.util.Scanner;
public class rifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("QUE TIPO DE Boleta Quiere ");
            System.out.println("1. Boleta Plata");
            System.out.println("2. Boleta De Oro");
            System.out.println("3. Boleta Diamante");
            opcion = sc.nextInt();
            if (opcion > 3) {
                System.out.print("ERROR INGRESASTE UNA OPCION NO VALIDA\n");
            }
        } while (opcion > 3);
         int cantidad;
switch (opcion) {
    case 1:{
        do {
            System.out.print("CUANTAS BOLESTAS QUIERES (Limite de boletas 100)\n");
            cantidad = sc.nextInt();
            int valor;
            if (cantidad < 5) {
                valor = cantidad * 5000;
                System.out.print("Compro " + cantidad + " Boletas Plata" + "\nDebes Pagar El Valor De: $ " + valor);
            } else if ((cantidad >= 5) && (cantidad <= 100)) {
                int valor2;
                valor2 = cantidad * 4500;
                System.out.print("Compro " + cantidad + " Boletas Plata" + "\nDebes Pagar El Valor De: $ " + valor2);
            } else {
                System.out.print("Valor incorecto\n");
            }
        } while (cantidad > 100);
    }break;
                    case 2: {
                        do {
                            System.out.print("CUANTAS BOLESTAS QUIERES (Limite de boletas 100)\n");
                            cantidad = sc.nextInt();
                            int valor;
                            if (cantidad < 3) {
                                valor = cantidad * 10000;
                                System.out.print("Compro " + cantidad + " Boletas Oro" + "\nDebes Pagar El Valor De: $ " + valor);
                            } else if ((cantidad >= 3) && (cantidad <= 100)) {
                                int valor2;
                                valor2 = cantidad * 9000;
                                System.out.print("Compro " + cantidad + " Boletas Oro" + "\nDebes Pagar El Valor De: $ " + valor2);
                            } else {
                                System.out.print("Valor incorecto\n");
                            }
                        } while (cantidad > 100);
                    }break;
                    case 3: {
                        do {
                            System.out.print("CUANTAS BOLESTAS QUIERES (Limite de boletas 100)\n");
                            cantidad = sc.nextInt();
                            int valor;
                            if (cantidad < 2) {
                                valor = cantidad * 20000;
                                System.out.print("Compro " + cantidad + " Boletas Diamante" + "\nDebes Pagar El Valor De: $ " + valor);
                            } else if ((cantidad >= 2) && (cantidad <= 100)) {
                                int valor2;
                                valor2 = cantidad * 18000;
                                System.out.print("Compro " + cantidad + " Boletas Diamante" + "\nDebes Pagar El Valor De: $ " + valor2);
                            } else {
                                System.out.print("Valor incorecto\n");
                            }
                        } while (cantidad > 100);
                    }break;
           default:
                System.out.print("Datos Invalido");

        }
    }
}
