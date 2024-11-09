package Student;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Collections {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(1,"abc");
        map.put(2,"sdf");
        map.put(5,"ert");
        map.put(3,"tuy");
        map.put(8,"adg");
        map.put(6,"jll");

        for (Map.Entry<Integer,String>m:map.entrySet()){
            System.out.println(m.getKey() +" -> "+m.getValue());
        }
    }
}
