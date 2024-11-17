import java.util.Scanner;

public class RufArroyoHelenaEjercicio2 {
    public static void main(String[] args) {

        System.out.println("Bienvenido a: Personaliza tu Ajedrez");
        Scanner input = new Scanner(System.in);
        System.out.println("¡Vamos a generar su tablero personalizado!\nPulse enter para continuar");
        input.nextLine();

        int tamañoCasillas = 0;

        while (tamañoCasillas < 1 || tamañoCasillas > 15) {
            System.out.println("Introduzca un numero entre 1-15 para el crear el tamaño de las casillas");

            if (input.hasNextInt()) {
                tamañoCasillas = input.nextInt();
                input.nextLine();
                if (tamañoCasillas >= 1 && tamañoCasillas <= 15) {
                    System.out.println("El tamaño escogido es " + tamañoCasillas);
                } else {
                    System.out.println("El tamaño escogido no es válido");
                }
            } else {
                System.out.println("Ha introducido un numero/carácter inválido.\nPor favor vuelva a introducir un numero del 1-15");
                input.next();
            }
        }

        System.out.println("Por último debe introducir el patrón para su tablero");
        String patronUsuario = input.nextLine();
        System.out.println("El Patrón escogido es " + patronUsuario);
        System.out.println();

        int filas = 8;
        int columnas = 8;

        System.out.println("¡AQUI TIENE SU TABLERO!");

        for (int i = 0; i < tamañoCasillas * columnas + 2; i++) {
              }

        System.out.println();
        for (int i = 0; i < filas; i++) {
            System.out.println();

            for (int k = 0; k < tamañoCasillas; k++) {
                for (int j = 0; j < columnas; j++)
                    if ((i + j) % 2 == 0) {
                        for (int l = 0; l < tamañoCasillas; l++) {
                            System.out.print(patronUsuario);
                        }
                    } else {
                        for (int l = 0; l < tamañoCasillas; l++) {
                            System.out.print(" ");
                        }
                    }
                System.out.println();
            }

        }
        System.out.println();
    }
}
