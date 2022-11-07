import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("----- Wypisanie pól studenta -----");
        Student s1 = new Student("Kacper", "Kowalski", Student.StudentCondition.PRESENT, 2001, 5, 1,"Polska");
        s1.printData();

        System.out.println("----- Dodanie Studenta do klasy i sprawdzenie powtarzalnosci -----");
        Student s2 = new Student("Mariusz", "Marek", Student.StudentCondition.PRESENT, 1999, 1, 1, "Niemiecka");
        Student s3= new Student("Darek", "Draniowski", Student.StudentCondition.ABSENT, 1995, 10, 1, "Amerykańska");
        Class c1 = new Class("Grupa 1", 2);
        c1.addStudent(s1);
//        c1.addStudent(s1);
        c1.addStudent(s2);
//        c1.addStudent(s3);

//        System.out.println("----- Dodanie punktow -----");
//        c1.summary();
//        c1.addPoints(s1, 15);
//        c1.summary();
//
//        System.out.println("----- Zmniejszanie punktow i usunieciem studenta przy braku punktow -----");
//        c1.getStudent(s1);
//        c1.getStudent(s2);
//        c1.summary();
//
//        System.out.println("----- Zmiana stanu studenta  -----");
//        c1.changeCondition(s1, Student.StudentCondition.CATCHINGUP);
//        c1.summary();
//
//        System.out.println("----- Usuniecie liczby punktow  -----");
//        c1.removePoints(s1, 7);
//        c1.summary();
//
//        System.out.println("----- Wszukanie studenta po nazwisku -----");
//        Student test = c1.search("Kowalski");
//        test.printData();
//        test = c1.search("Kow");
//        test.printData();
//
//        System.out.println("----- Wszukanie studenta po fragmencie imienia lub nazwiska -----");
//        List<Student> result;
//        c1.addStudent(s1);
//        result = c1.searchPartial("ski");
//        for(Student student : result)
//            student.printData();
//
//        System.out.println("----- Zwrócenie ilosci osob z danym stanem -----");
//        System.out.println(c1.countByCondition(Student.StudentCondition.CATCHINGUP));
//        System.out.println();
//
//        System.out.println("----- Sortowanie po imieniu -----");
//        result = c1.sortByName();
//        for(Student stu : result)
//            stu.printData();
//
//        System.out.println("----- Sortowanie po ilości punktów -----");
//        result = c1.sortByPoints();
//        for(Student stu: result)
//            stu.printData();
//
//        System.out.println("----- Metoda Collections.max() -----");
//        c1.max();
//
//        ClassContainer container = new ClassContainer();
//        container.addClass("Grupa 2", 3);
//        System.out.println("----- Dodanie nowej grupy -----");
//        System.out.println(container.groups.keySet());
//
//        System.out.println("----- Usuwanie grupy o podanej nazwie -----");
//        container.removeClass("Grupa 2");
//        System.out.println(container.groups.keySet());
//
//        System.out.println("----- Wyświetlenie pustych grup -----");
//        container.addClass("Grupa 3", 3);
//        List<String> empty = container.findEmpty();
//        System.out.println("Empty groups:");
//        for(String e : empty)
//            System.out.println(e);
//
//        System.out.println("----- Wypisanie nazwy grupy i procentowego zapelnienia -----");
//        container.addClass("Grupa 3", 3);
//        Class temp = container.groups.get("Grupa 3");
//        temp.addStudent(s1);
//        container.summary();
    }
}