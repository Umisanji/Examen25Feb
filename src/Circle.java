public class Circle extends GeometricObject {
    private double radius;

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * 3.1416;
    }
    
    public double getPerimeter() {
        return 2 * radius * 3.1416;
    }

    public double getDiameter() {
        return radius + radius;
    }

    public void printCircle() {
        System.out.println("Imprimir datos del circulo");
    }
}
