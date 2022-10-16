public class Prism {
    private Figure base;
    private double h;

    public Prism(Figure base, double h) {
        if ( h < 0 ) {
            throw new IllegalArgumentException("Illegal argument");
        }
        this.base = base;
        this.h = h;
    }
    double calculateArea() {
        return 2 * base.calculateArea() + base.calculatePerimeter() * h;
    }

    double calculateVolume() {
        return base.calculateArea() * h;
    }

    public void print() {
        System.out.println("Calculated area: " + calculateArea());
        System.out.println("Calculated volume: " + calculateVolume());
    }
}
