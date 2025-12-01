import java.util.Scanner;
public class emisora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("QUE TIPO DE Boleta Quiere ");
            System.out.println("1. Emisora Pop");
            System.out.println("2. Emisora Rock");
            System.out.println("3. Emisora Vallenato)");
            opcion = sc.nextInt();
            if (opcion > 3) {
                System.out.print("ERROR INGRESASTE UNA OPCION NO VALIDA\n");
            }
        } while (opcion > 3);
        switch (opcion) {
            case 1:
                int hora;
                do {
                    System.out.println("Coloque la La Hora en hora militar ");
                    hora = sc.nextInt();
                    if ((hora >= 6 ) && (hora <= 12)) {
                        System.out.print("Pop De La Mañana\n");
                    } else if ((hora >= 13) && (hora <= 18)) {
                        System.out.print("Exitos Del Momento\n");
                    } else if ((hora >= 19) && (hora <= 24)){
                        System.out.print("Noche Pop\n");
                    }else {
                        System.out.print("Dato Incorrecto\n");
                    }
                } while (hora > 24);
                break;
            case 2:
                int hora2;
                do {
                    System.out.println("Coloque la La Hora en hora militar ");
                    hora2 = sc.nextInt();
                    if ((hora2 >= 6 ) && (hora2 <= 12)) {
                        System.out.print("Rock clásico\n");
                    } else if ((hora2 >= 13) && (hora2 <= 18)) {
                        System.out.print("Rock en español\n");
                    } else if ((hora2 >= 19) && (hora2 <= 24)){
                        System.out.print("Rock pesado\n");
                    }else {
                        System.out.print("Dato Incorrecto\n");
                    }
                } while (hora2 > 24);
                break;
            case 3:
                int hora3;
                do {
                    System.out.println("Coloque la La Hora en hora militar ");
                    hora3 = sc.nextInt();
                    if ((hora3 >= 6 ) && (hora3 <= 12)) {
                        System.out.print("Vallenato tradicional\n");
                    } else if ((hora3 >= 13) && (hora3 <= 18)) {
                        System.out.print("Vallenato moderno\n");
                    } else if ((hora3 >= 19) && (hora3 <= 24)){
                        System.out.print("Parranda vallenata\n");
                    }else {
                        System.out.print("Dato Incorrecto\n");
                    }
                } while (hora3 > 24);
                break;
            default:
                System.out.print("Dato Invalido\n");
        }
      }
    }