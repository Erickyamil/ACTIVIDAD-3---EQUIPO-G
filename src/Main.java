import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1) Círculo");
            System.out.println("2) Rectángulo");
            System.out.println("3) Triángulo");
            System.out.println("4) Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    System.out.print("Ingrese el color del círculo: ");
                    String colorCirculo = scanner.next();
                    System.out.print("¿Está relleno? (true/false): ");
                    char variable = scanner.next().toUpperCase().charAt(0);
                    boolean rellenoCirculo = (variable == 'T'|| variable == 'S');
                    Circulo circulo = new Circulo(colorCirculo, new java.util.Date(), rellenoCirculo, radio);
                    System.out.println(circulo);
                    break;

                case 2:
                    System.out.print("Ingrese la base del rectángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double altura = scanner.nextDouble();
                    System.out.print("Ingrese el color del rectángulo: ");
                    String colorRectangulo = scanner.next();
                    System.out.print("¿Está relleno? (true/false): ");
                    variable = scanner.next().toUpperCase().charAt(0);
                    boolean rellenoRectangulo = (variable == 'T'|| variable == 'S');
                    Rectangulo rectangulo = new Rectangulo(base, altura, colorRectangulo, rellenoRectangulo);
                    System.out.println(rectangulo);
                    break;

                case 3:
                    System.out.print("Ingrese el primer lado del triángulo: ");
                    double lado1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo lado del triángulo: ");
                    double lado2 = scanner.nextDouble();
                    System.out.print("Ingrese el tercer lado del triángulo: ");
                    double lado3 = scanner.nextDouble();
                    System.out.print("Ingrese el color del triángulo: ");
                    String colorTriangulo = scanner.next();
                    System.out.print("¿Está relleno? (true/false): ");
                    variable = scanner.next().toUpperCase().charAt(0);
                    boolean rellenoTriangulo = (variable == 'T'|| variable == 'S');
                    Triangulo triangulo = new Triangulo(colorTriangulo, rellenoTriangulo, lado1, lado2, lado3);
                    System.out.println(triangulo);
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
