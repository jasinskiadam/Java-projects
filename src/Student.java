public class Student implements Comparable<Student> {
    String name;
    String surname;
    StudentCondition condition;
    int year_of_birth;
    double points;
    int group;
    String nationality;


    Student(String name, String surname, StudentCondition condition, int year_of_birth, double points,  int group, String nationality){
        this.name = name;
        this.surname = surname;
        this.condition = condition;
        this.year_of_birth = year_of_birth;
        this.points = points;
        this.group = group;
        this.nationality = nationality;
    }

    enum StudentCondition{
        PRESENT{
            @Override public String toString() {
                return "Present";
            }
        },
        ABSENT{
            @Override public String toString() {
                return "Absent";
            }
        },
        SICK{
            @Override public String toString() {
                return "Sick";
            }
        },
        CATCHINGUP{
            @Override public String toString() {
                return "Catching up";
            }
        },
    }
    public String getName() {
        return name;
    }

    public double getPoints() {
        return points;
    }

    void printData(){
        System.out.println("STUDENT: ");
        System.out.println("-----------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Condition: " + this.condition);
        System.out.println("Year of birth: " + this.year_of_birth);
        System.out.println("Points: " + this.points);
        System.out.println("Group: " + this.group);
        System.out.println("Nationality: " + this.nationality);
        System.out.println("-----------------------");
    }

    @Override
    public int compareTo(Student s){
        return this.surname.compareTo(s.surname);
    }

}