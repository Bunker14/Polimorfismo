package figures;

public class Rectangle extends Figure {

    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return this.getBase() * this.getHeight();
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}

