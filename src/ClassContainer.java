import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class ClassContainer {
    Map<String, Class> groups;

    ClassContainer(){
        this.groups = new HashMap<String, Class>();
    }

    public void addClass(String group_name, int max_students){
        this.groups.put(group_name, new Class(group_name, max_students));
    }

    public void removeClass(String group_name){
        this.groups.remove(group_name);
    }

    public List<String> findEmpty(){
        List<String> result = new ArrayList<>();
        for(String key: this.groups.keySet()){
            if(this.groups.get(key).students.isEmpty()){
                result.add(key);
            }
        }
        return result;
    }

    public void summary(){
        for(String key : this.groups.keySet()){
            System.out.println("Group: " + key + "\tFull in: " + this.groups.get(key).students.size()*100/this.groups.get(key).max_students + "%");
        }
    }
}
