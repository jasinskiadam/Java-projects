public class Square extends Figure {
    private double a;

    public Square(double a) {
        if (a <= 0){
            throw new IllegalArgumentException("Illegal agrument");
        }
        this.a = a;
    }

    @Override
    double calculateArea() {
        return a * a;
    }

    @Override
    double calculatePerimeter() {
        return a * 4;
    }

    @Override
    public void print() {
        System.out.println("a value: " + a);
        System.out.println("Calculated area: " + calculateArea());
        System.out.println("Calculated perimeter: " + calculatePerimeter());
    }
}
