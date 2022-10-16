import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        menu();

        while(true) {
            int option = scanner.nextInt();

            switch(option) {
                case 1:
                    System.out.println("Square");
                    System.out.println("Enter square side length: ");
                    double a = scanner.nextDouble();
                    Square s1 = new Square(a);
                    s1.print();
                    menu();
                    break;
                case 2:
                    System.out.println("Circle");
                    System.out.println("Enter circle radius: ");
                    double r = scanner.nextDouble();
                    Circle c1 = new Circle(r);
                    c1.print();
                    menu();
                    break;
                case 3:
                    System.out.println("Triangle");
                    System.out.println("Enter first side length: ");
                    double first = scanner.nextDouble();
                    System.out.println("Enter second side length: ");
                    double second = scanner.nextDouble();
                    System.out.println("Enter third side length: ");
                    double third = scanner.nextDouble();
                    System.out.println("Enter height ");
                    double height = scanner.nextDouble();
                    Triangle t1 = new Triangle(1,2,3,4);
                    t1.print();
                    menu();
                    break;
                case 4:
                    System.out.println("4. Prism");
                    System.out.println("Choose figure: ");
                    System.out.println("1. Square");
                    System.out.println("2. Triangle");
                    System.out.println("3. Exit from prism mode");
                        int option2 = scanner.nextInt();
                        switch (option2){
                            case 1:
                                System.out.println("Square Prism");
                                System.out.println("Enter square side length: ");
                                double a2 = scanner.nextDouble();
                                Square s2 = new Square(a2);
                                System.out.println("Enter height: ");
                                double h2 = scanner.nextDouble();
                                Prism p2 = new Prism(s2, h2);
                                p2.print();
                                break;
                            case 2:
                                System.out.println("Triangle Prism");
                                System.out.println("Enter triangle sides length:");
                                double s = scanner.nextDouble();
                                Triangle t2 = new Triangle(s,s,s, s*Math.sqrt(3/2));
                                System.out.println("Enter height:");
                                double h3 = scanner.nextDouble();
                                Prism p3 = new Prism(t2, h3);
                                p3.print();
                                break;
                            case 3:
                                menu();
                                break;
                            default:
                                System.out.println("Incorrect choice, try again: ");
                                break;
                        }
                case 5:
                    return;
                default:
                    System.out.println("Illegal input, try again!");
                    menu();
                    break;
            }
        }
    }

    private static void menu() {
            System.out.println("\nWelcome in abstract Java calculator");
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Prism");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");
        }
}