import java.util.HashMap;

public class MoveTen {
  public static String moveTen(String s) {
    String result = "";
    HashMap<Character, Character> tenAlphabet = new HashMap<Character, Character>();
    
    tenAlphabet.put('a', 'k');
    tenAlphabet.put('b', 'l');
    tenAlphabet.put('c', 'm');
    tenAlphabet.put('d', 'n');
    tenAlphabet.put('e', 'o');
    tenAlphabet.put('f', 'p');
    tenAlphabet.put('g', 'q');
    tenAlphabet.put('h', 'r');
    tenAlphabet.put('i', 's');
    tenAlphabet.put('j', 't');
    tenAlphabet.put('k', 'u');
    tenAlphabet.put('l', 'v');
    tenAlphabet.put('m', 'w');
    tenAlphabet.put('n', 'x');
    tenAlphabet.put('o', 'y');
    tenAlphabet.put('p', 'z');
    tenAlphabet.put('q', 'a');
    tenAlphabet.put('r', 'b');
    tenAlphabet.put('s', 'c');
    tenAlphabet.put('t', 'd');
    tenAlphabet.put('u', 'e');
    tenAlphabet.put('v', 'f');
    tenAlphabet.put('w', 'g');
    tenAlphabet.put('x', 'h');
    tenAlphabet.put('y', 'i');
    tenAlphabet.put('z', 'j');
    
    for (char i : s.toCharArray()) {
      result += tenAlphabet.get(i);
    }
    
    
    return result;
  }
}