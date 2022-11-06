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

    public void removePoints(Student student, double points){
        student.points -= points;
    }

    public Student search(String str){
        try {
            for (Student student : students) {
                if (compare(str, student.surname) == 0)
                    return student;
            }
            throw new Exception("There is no student with this surname");
        }
        catch(Exception e){
            System.err.println("Error: " + e);
        }
        return new Student("Brak", "Brak", Student.StudentCondition.ABSENT, 0, 0, 0,"Brak");
    }

    public List<Student> searchPartial(String str){
        List<Student> result = new ArrayList<>();
        for(Student student : students){
            if(student.name.contains(str)||student.surname.contains(str))
                result.add(student);
        }
        return result;
    }

    public int countByCondition(Student.StudentCondition condition){
        int result = 0;
        for(Student student: students){
            if(student.condition==condition)
                result++;
        }
        return result;
    }
}

