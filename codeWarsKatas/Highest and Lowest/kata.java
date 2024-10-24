public class Kata {
  public static String highAndLow(String numbers) {
    String[] inp = numbers.split(" ");
    int min = Integer.parseInt(inp[0]), max = Integer.parseInt(inp[0]);
    
    for (String i : inp) {
      if (Integer.parseInt(i) <= min) {
        min = Integer.parseInt(i);
      }
      if (Integer.parseInt(i) >= max) {
        max = Integer.parseInt(i);
      }
    }
    
    return max + " " + min;
  }
}