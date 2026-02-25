import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled = false;
    private java.util.Date dateCreated;

    public GeometricObject() {

    }

    public GeometricObject(String color, boolean filled, java.util.Date dateCreated) {
        this.color = color;
        this.filled = false;
        this.dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return super.toString();
    }
    
}
