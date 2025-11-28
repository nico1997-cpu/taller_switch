import java.util.Scanner;

public class Gimnacio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        do {
            System.out.println("QUE TIPO DE SUSCRIPCION TIENE ");
            System.out.println("1. Plan Básico");
            System.out.println("2. Plan Intermedio");
            System.out.println("3. Plan Premium");
            respuesta = sc.nextInt();
            if (respuesta > 3) {
                System.out.print("ERROR INGRESASTE UNA OPCION NO VALIDA\n");
            }
        } while (respuesta > 3);
        int meses;
        switch (respuesta)
        {

            case 1: //Plan basico
                do {
                    System.out.println("lEA Y ELIJA UNA OPCION VALIDA");
                    System.out.println("OPCION 1. (1 mes)");
                    System.out.println("OPCION 2. (3 meses)");
                    System.out.println("OPCION 3. (6 meses)");
                    System.out.println("OPCION. SI DESEA MAS DE 6 MESES INGRESA LA CANTIDAD DE MESES");
                    meses = sc.nextInt();
                    if (meses == 1) {
                        System.out.print("Debes pagar $30000 por 1 mes de suscripción y has Elegido el PLAN BASICO");
                    } else if (meses == 2) {
                        System.out.print("Debes pagar $80000 por 3 meses de suscripción y has Elegido el PLAN BASICO");
                    } else if (meses == 3) {
                        System.out.print("debes pagar $150.000 por 6 meses de suscripción y has Elegido el PLAN BASICO");
                    } else if (meses > 6) {
                        int valor = (meses * 30000) - (10000);
                        System.out.print("HAS ELEGIDO El PLAN BASICO");
                        System.out.print("\nLa suscripción De Meses Son: " + meses);
                        System.out.print("\nvalor a pagar $: " + valor);
                    } else {
                        System.out.print("DATO ERRONEO\n");
                    }
                } while ((meses >3) && (meses <= 6)) ;
                break;
            case 2:
                do {
                    System.out.println("lEA Y ELIJA UNA OPCION VALIDA");
                    System.out.println("OPCION 1. (1 mes)");
                    System.out.println("OPCION 2. (3 meses)");
                    System.out.println("OPCION 3. (6 meses o mas meses)");
                    meses = sc.nextInt();
                    if (meses == 1) {
                        System.out.print("Debes pagar $40000 por 1 mes  de suscripción y has Elegido el PLAN INTERMEDIO");
                    } else if (meses == 2) {
                        System.out.print("Debes pagar $110000 por 3 meses de suscripción y has Elegido el PLAN INTERMEDIO");
                    } else if (meses == 3) {
                        System.out.print("Debes pagar $200000 por 6 o mas meses de suscripción y has Elegido el PLAN INTERMEDIO");
                    } else {
                        System.out.print("DATO ERRONEO\n");
                    }
                } while (meses >3) ;
                break;
            case 3:
                do {
                    System.out.println("lEA Y ELIJA UNA OPCION VALIDA");
                    System.out.println("OPCION 1. (1 mes)");
                    System.out.println("OPCION 2. (3 meses)");
                    System.out.println("OPCION 3. (6 meses o mas meses)");
                    meses = sc.nextInt();
                    if (meses == 1) {
                        System.out.print("Debes pagar 60000 por 1 mes  de suscripción y has Elegido el PLAN INTERMEDIO");
                    } else if (meses == 2) {
                        System.out.print("Debes pagar 160000 por 3 meses de suscripción y has Elegido el PLAN INTERMEDIO");
                    } else if (meses == 3) {
                        System.out.print("Debes pagar $280000 por 6 o mas meses de suscripción y has Elegido el PLAN INTERMEDIO");
                    } else {
                        System.out.print("DATO ERRONEO\n");
                    }
                } while (meses >3) ;
            default:
                System.out.print("INGRESASTE UN DATOS ERRONEO");
             }
        }
    }



