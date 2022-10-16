public class Circle extends Figure {

    private double r;

    public Circle(double r) {
        if (r <= 0){
            throw new IllegalArgumentException("Illegal argument");
        }
        this.r = r;
    }

    @Override
    double calculateArea() {
        return Math.PI * r * r;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public void print() {
        System.out.println("r value: " + r);
        System.out.println("Calculated area: " + calculateArea());
        System.out.println("Calculated perimeter: " + calculatePerimeter());
    }
}
