package figures;

public class Triangle extends Figure {

    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (this.getBase() * this.getHeight()) / 2;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}