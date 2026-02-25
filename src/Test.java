import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce 3 lados de un triangulo: ");
        double lado1 = input.nextDouble();
        double lado2 = input.nextDouble();
        double lado3 = input.nextDouble();
        System.out.println("Introduce un color: ");
        String color = input.next();
        System.out.println("El triangulo esta lleno? (true/false)");
        boolean filled = input.nextBoolean();
        Triangle triangle = new Triangle(lado1, lado2, lado3, color, filled);
        System.out.println(triangle.toString());

        input.close();
    }

}
