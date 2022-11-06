import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
public class Class implements Comparator<String> {
    String group_name;
    List<Student> students = new ArrayList<>();
    int max_students;

    Class(String group_name, int max_students) {
        this.group_name = group_name;
        this.max_students = max_students;
    }

    @Override
    public int compare(String s1, String s2){
        return s1.compareToIgnoreCase(s2);
    }
    public void addStudent(Student s){
        try{
            if(students.size() >= max_students)
                throw new Exception("Max number of students");
            for(Student student: students) {
                if(student.name.equals(s.name))
                    throw new Exception("Student is already in the group");
            }
            students.add(s);
        }
        catch (Exception E) {
            System.err.println("Error: " + E);
        }
    }

    public void addPoints(Student student, double points){
        student.points += points;
    }

    public void getStudent(Student student){
        student.points--;
        if(student.points<=0)
            this.students.remove(student);
    }

    public void changeCondition(Student student, Student.StudentCondition condition){
        student.condition = condition;
    }

}

