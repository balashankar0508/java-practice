import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.lang.Integer;

class Ms {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        
        System.out.println(map);
        
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        
        System.out.println(set);
    }
}