public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }

    public IllegalTriangleException() {
        super("Los lados no forman un triangulo");
    }

}
