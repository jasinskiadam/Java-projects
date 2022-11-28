import javax.swing.table.AbstractTableModel;

public class StudentTable extends AbstractTableModel {
    String[] SCOLS = {"Imie", "Nazwisko", "Status", "Data urodzenia" , "Punkty","Narodowosc" };
    Class cl;

    public StudentTable(Class c){
        this.cl = c;
    }
    public Object getValueAt(int r, int c){
        return switch (c) {
            case 0 -> cl.students.get(r).name;
            case 1 -> cl.students.get(r).surname;
            case 2 -> cl.students.get(r).condition;
            case 3 -> cl.students.get(r).year_of_birth;
            case 4 -> cl.students.get(r).points;
            case 5 -> cl.students.get(r).nationality;
            default -> null;
        };
    }

    public int getColumnCount(){
        return 6;
    }

    public int getRowCount(){
        return cl.students.size();
    }

    public String getColumnName(int c){
        return SCOLS[c];
    }

    public void setValueAt(Object value, int r, int c){
        if(c==0){
            cl.students.get(r).setName((String)value);
        }
        else if(c==1){
            cl.students.get(r).setSurname((String)value);
        }
        else if(c==3){
            cl.students.get(r).setYear_of_birth(Integer.parseInt((String)value));
        }
        else if(c==4){
            cl.students.get(r).setPoints(Double.parseDouble((String)value));
        }
        else if(c==5){
            cl.students.get(r).setNationality((String)value);
        }
        fireTableCellUpdated(r, c);
    }

    public boolean isCellEditable(int r, int c) {
        return true;
    }

    public void newStudent(String name, String surname, int birthday ,double points ,String nationality){
        cl.addStudent(new Student(name, surname, Student.StudentCondition.PRESENT, birthday, points, nationality));
        fireTableDataChanged();
    }

    public void deleteStudent(int index){
        cl.students.remove(index);
        fireTableDataChanged();
    }

    public void changeModel(Class c){
        this.cl = c;
        fireTableDataChanged();
    }

    public void sort(){
        this.cl.sortByPoints();
        fireTableDataChanged();
    }
}

