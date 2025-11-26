import java.util.Scanner;
public class operadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HOLA EN QUE PUEDDO AYUDARTE");
        System.out.println("opciones:");
        System.out.println("1. PLAN DE DATOS NUEVO");
        System.out.println("2. EXPLICACION DE SU FACTURA");
        System.out.println("3. SOPORTE TECNICO");
        System.out.println("4. PORTABILIDAD");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1: //  PLAN DE DATOS
                System.out.println("\nQUE PLAN QUIERE ");
                System.out.println("1. 25990 (30GB MINUTOS ILIMITADOS) ");
                System.out.println("2. 32990 (45GB MINUTOS ILIMITADOS)");
                System.out.println("3. 55000 (50GB MINUTOS ILIMITADOS Y 200 LATAM)");
                System.out.println("4. 75000 (DATOS ILIMITADOS MINUTOS ILIMITADOS Y 500 A LATAM");
                int plan = sc.nextInt();
                if (plan == 1) {
                    System.out.print("Plan 30GB MINUTOSO ILIMITADOS A TODO DESTINO");
                } else if (plan == 2) {
                    System.out.print("Plan 45GB MINUTOS ILIMITADOS A TODO DESTINO");
                } else if (plan == 3) {
                    System.out.print("Plan 50 GB MINUTOS ILIMITADOS y 200 LATAM");
                } else if (plan == 4) {
                    System.out.print("Plan DATOS ILIMITADOS MINUTOS ILIMITADOS Y 500 A LATAM");
                } else {
                    System.out.print("DATO INVALIDO");
                }

                break;
            case 2: // Explicación de factura
                System.out.print("Que desea saber de la factura\n");
                System.out.print("1. Inconformidad con su factura\n");
                System.out.print("2. Quiero saber mis ciclos de facturación\n");
                System.out.print("3. Quiero bajarle a mi factura\n");
                int factura = sc.nextInt();
                if ((factura == 1) || (factura == 3)) {
                    System.out.print("Ya te comunicamos con un asesor");
                } else if (factura == 2) {
                    System.out.print("Tu ciclo de factura llega el 9 de cada mes y limite de pago hasta el 18 de cada mes");
                } else {
                    System.out.print("DATO INVALIDO");
                }
                break;
            case 3: //Soporte tecnico
                System.out.print("QUE SERVICIO TIENES (HOGAR / MOVIL)\n");
                System.out.print("1. MOVIL\n");
                System.out.print("2. HOGAR\n");
                int servicio = sc.nextInt();
                if ((servicio == 1) || (servicio == 2)) {
                    System.out.print("YA TE VAMOS A COMUNICAR CON UN ASERSOR");
                } else {
                    System.out.print("DATO INVALIDO");
                }
                break;
            case 4: //Portabilidad
                System.out.print("Que Tipo manejas(Pospago/Prepago)\n");
                System.out.print("1. Pospago\n");
                System.out.print("2. Prepago\n");
                int portabilidad = sc.nextInt();
                if ((portabilidad == 1) || (portabilidad == 2)) {
                    System.out.print("Ya lo comunicamos con un asesor");
                }else {
                    System.out.print("Dato invalido");
                }
                break;
            default:
                System.out.println("Dato invalido");
        }
    }
}