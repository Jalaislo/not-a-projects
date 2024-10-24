public class Kata {
    public class NumberUtils {
        public static boolean isNarcissistic(int number) {
            char[] inp = Integer.toString(number).toCharArray();
            int result = 0;
        
            for (char i : inp) {
                result += Math.pow(Character.getNumericValue(i), inp.length);
            }

            if (result == number) {
                return true;
            }
        
            return false;
        }
    }
}