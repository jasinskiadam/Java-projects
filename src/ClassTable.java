import javax.swing.table.AbstractTableModel;

public class ClassTable extends AbstractTableModel {
    String[] CCOLS = {"Nazwa grupy", "Maksymalna liczba studentów"};
    ClassContainer cc;
    public ClassTable(){
        Student s1 = new Student("Kacper", "Kowalski", Student.StudentCondition.PRESENT, 2001, 5,"Polska");
        Student s2 = new Student("Mariusz", "Marek", Student.StudentCondition.PRESENT, 1999, 1,  "Niemiecka");
        Student s3= new Student("Darek", "Draniowski", Student.StudentCondition.ABSENT, 1995, 10,  "Amerykańska");
        Student s4= new Student("Bartek", "Bartowski", Student.StudentCondition.CATCHINGUP, 1975, 2,  "Polska");

        Class c = new Class("Grupa A", 5);
        c.addStudent(s1);
        c.addStudent(s2);
        c.addStudent(s3);
        c.addStudent(s4);

        Class c1 = new Class("Grupa B", 10);
        c1.addStudent(s1);

        cc = new ClassContainer();
        cc.addClass(c);
        cc.addClass(c1);
    }
    public Object getValueAt(int r, int c){
        return switch (c) {
            case 0 -> cc.groups.get(r).group_name;
            case 1 -> cc.groups.get(r).max_students;
            default -> null;
        };
    }

    public int getColumnCount(){
        return 2;
    }

    public int getRowCount(){
        return cc.groups.size();
    }

    public String getColumnName(int c){
        return CCOLS[c];
    }

    public void setValueAt(Object value, int r, int c){
        if(c==0){
            cc.setName((String)value, r);
        }
        else if(c==1){
            cc.setMax(Integer.parseInt((String)value), r);
        }
        fireTableCellUpdated(r, c);
    }

    public boolean isCellEditable(int r, int c) {
        return true;
    }

    public void newClass(String name, int max){
        cc.addClass(new Class(name, max));
        fireTableDataChanged();
    }

    public void deleteClass(int index){
        cc.removeGroup(index);
        fireTableDataChanged();
    }
}
