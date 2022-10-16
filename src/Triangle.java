public class Triangle extends Figure {
    private double a,b,c,h;

    public Triangle(double a, double b, double c, double h) {
        if ( a <= 0 || b <= 0 || c <= 0 || h <= 0) {
            throw new IllegalArgumentException("Illegal argument");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    double calculateArea() {
        return (0.5 * a) * h;
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public void print() {
        System.out.println("a value: " + a);
        System.out.println("b value: " + b);
        System.out.println("c value: " + c);
        System.out.println("h value: " + h);
        System.out.println("Calculated area: " + calculateArea());
        System.out.println("Calculated perimeter: " + calculatePerimeter());
    }
}
