import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido al juego del Ajedrez");
        Scanner input = new Scanner(System.in);
        System.out.println("¡Vamos a generar su tablero personalizado!\nPulse enter para continuar");
        input.nextLine();

        int tamañoPatron = 0;

        while (tamañoPatron < 1 || tamañoPatron > 15) {
            System.out.println("Introduzca un numero entre 1-15 para el crear el tamaño del tablero personalizado");

            if (input.hasNextInt()) {
                tamañoPatron = input.nextInt();
                if (tamañoPatron >= 1 && tamañoPatron <= 15) {
                    System.out.println("El tamaño escogido es " + tamañoPatron);
                } else {
                    System.out.println("El numero escogido no es válido");
                }
            } else {
                System.out.println("Ha introducido un numero/carácter inválido.\nPor favor vuelva a introducir un numero del 1-15");
                input.next();
            }
        }

        int patronUsuario = 0;


    }
}
/* En el mercado de construir tableros de ajedrez, es aún mejor si permites que las personas personalicen
sus tableros. Por ejemplo, en lugar de tener cuadrados negros sólidos, puedes ofrecer la posibilidad de
imprimir cualquier patrón como una letra, un número o incluso un símbolo. Otra característica podría ser
permitir a los clientes definir el tamaño de las casillas en su tablero de ajedrez.
La Salle Chess Board SL, entes de comenzar una producción masiva de tableros de ajedrez, quiere
asegurarse de que el software esté listo para admitir la impresión de patrones personalizados.
Te pide que escribas un programa en Java que imprima un tablero de ajedrez dado un patrón definido
por un carácter específico y el tamaño de cada casilla.
En tu programa tendrás que:
• Solicitar al usuario el carácter que usar como patrón. Puede ser una letra, un número o incluso
un símbolo.
• Solicitar al usuario el tamaño de la casilla (1<=size<=15)
Tu programa imprimirá por consola el tablero
Utiliza GitHub como repositorio remoto para llevar a cabo el seguimiento del progreso.
A continuación, tienes varios ejemplos */