import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido al juego del Ajedrez");
        Scanner input = new Scanner(System.in);
                System.out.println("A continuación se le solicitará introducir dos carácteres para generar su tablero personalizado");
                input.nextLine();
        int patronUsuario = 0;
        int tamañoPatron = 0;

        while (patronUsuario < 1 || patronUsuario > 9) {
            System.out.println("Introduzca el primer carácter para establecer un patrón");
            if (input.hasNextInt()) {
                patronUsuario = input.nextInt();
                if (patronUsuario < 1 || patronUsuario > 9) {
                    System.out.println("Has escogido un numero incorrecto.\nPor favor vuelve a introducir un numero del 1-9");
                break; /* pendiente crear el segundo patron y solucionar bucle */
                }
            }
        }
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