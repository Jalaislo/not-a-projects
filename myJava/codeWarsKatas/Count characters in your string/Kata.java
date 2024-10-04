import java.util.Map;
import java.util.HashMap;

public class Kata {
    public static Map<Character, Integer> count(String str) {
      Map<Character, Integer> countMap = new HashMap<Character, Integer>();
      
      for (char i : str.toCharArray()) {
        if(!countMap.containsKey(i)) {
          countMap.put(i, 1);
        } else {
          countMap.replace(i, countMap.get(i) + 1);
        }
      }
      
      return countMap;
    }
}