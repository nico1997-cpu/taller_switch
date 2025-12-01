import java.util.Scanner;
public class carro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("QUE TIPO DE Boleta Quiere ");
            System.out.println("1. Luces");
            System.out.println("2. Ajuste De (Velocidad)");
            System.out.println("3. Activar modo de conducción (Normal, Eco o Sport)");
            opcion = sc.nextInt();
            if (opcion > 3) {
                System.out.print("ERROR INGRESASTE UNA OPCION NO VALIDA\n");
            }
            } while (opcion > 3);
            switch (opcion) {
            case 1:
                int luces;
                do {
                    System.out.println("Si Desea Encender Luces Marque 1 ");
                    System.out.println("Si Desea Apagar Luces Marque 2 ");
                    luces = sc.nextInt();
                    if (luces == 1) {
                        System.out.print("Luces Encendidas\n");
                    } else if (luces == 2) {
                        System.out.print("Luces Apagadas\n");
                    } else {
                        System.out.print("Datos no Valido\n");
                    }
                } while (luces > 2);
                break;
            case 2:
                int velocidad;
                int objetivo;
                do {
                    System.out.println(" Marque La Velocidad Actual");
                    velocidad = sc.nextInt();
                    System.out.println("Marque la Velocidad que quiere");
                    objetivo = sc.nextInt();
                    if (velocidad == objetivo) {
                        System.out.print("Mantener Velocidad\n");
                    } else if (velocidad > objetivo) {
                        System.out.print("Debes Frenar\n");
                    } else if (velocidad < objetivo) {
                        System.out.print("Debes Acelerar\n");
                    } else {
                        System.out.print("Dato No Valido");
                    }
                } while ((velocidad > 250) || (objetivo > 270));
                break;
            case 3:
                int tipo;
                do {
                    System.out.println("Tipo de Modo que Quiere\n Opcion 1. Normal\n Opcion 2.Eco\n Opcion3. Sport\n");
                    tipo = sc.nextInt();
                    if (tipo == 1) {
                        System.out.print("Eligio Normal: Equilibrio entre consumo y potencia, conducción cómoda y estable.\n");
                    } else if (tipo == 2) {
                        System.out.print("Eligio Eco: Reduce consumo y acelera suave para ahorrar combustible.\n");
                    } else if (tipo == 3) {
                        System.out.print("Eligio Sport: Mayor potencia, aceleración rápida y respuesta más agresiva.\n");
                    } else {
                        System.out.print("Dato No Valido");
                    }
                } while (tipo >= 4);
                break;
                default:
                    System.out.printf("Dato No Valido");
        }
    }
  }
