import java.util.Map;
import java.util.HashMap;

public class ClassContainer {
    Map<String, Class> groups;

    ClassContainer(){
        this.groups = new HashMap<String, Class>();
    }

    public void addClass(String group_name, int max_students){
        this.groups.put(group_name, new Class(group_name, max_students));
    }
}
