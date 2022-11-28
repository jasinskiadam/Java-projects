public class Student implements Comparable<Student> {
    String name;
    String surname;
    StudentCondition condition;
    int year_of_birth;
    double points;
    String nationality;


    Student(String name, String surname, StudentCondition condition, int year_of_birth, double points, String nationality){
        this.name = name;
        this.surname = surname;
        this.condition = condition;
        this.year_of_birth = year_of_birth;
        this.points = points;
        this.nationality = nationality;
    }

    enum StudentCondition{
        PRESENT{
            @Override public String toString() {
                return "Obecny";
            }
        },
        ABSENT{
            @Override public String toString() {
                return "Nieobecny";
            }
        },
        SICK{
            @Override public String toString() {
                return "Chory";
            }
        },
        CATCHINGUP{
            @Override public String toString() {
                return "Odrabiający";
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
        System.out.println("Nationality: " + this.nationality);
        System.out.println("-----------------------");
    }

    @Override
    public int compareTo(Student s){
        return this.surname.compareTo(s.surname);
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setCondition(StudentCondition condition){
        this.condition = condition;
    }

    public void setYear_of_birth(int year){
        this.year_of_birth = year;
    }

    public void setPoints(double points){
        this.points = points;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }
}