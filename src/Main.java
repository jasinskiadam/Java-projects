import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 2.a, 2.b
        System.out.println();
        System.out.println("----- Wypisanie pól studenta -----");
        Student s1 = new Student("Kacper", "Kowalski", Student.StudentCondition.PRESENT, 2001, 5, 1,"Polska");
        s1.printData();
    }
}