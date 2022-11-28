import java.util.ArrayList;
import java.util.List;

public class ClassContainer {
    List<Class> groups;
    ClassContainer(){
        this.groups= new ArrayList<>();
    }
    public void addClass(Class c){
        this.groups.add(c);
    }
    public void removeGroup(int id){
        this.groups.remove(id);
    }
    public void setName(String name, int index){
        this.groups.get(index).setGroup_name(name);
    }
    public void setMax(int max, int index){
        this.groups.get(index).setMax(max);
    }
}
