using System;

public class Kata
{
  public static int SquareDigits(int n)
  {
    string n_str = Convert.ToString(n);
    int[] n_arr = new int[n_str.Length];
    string result = "";
    
    foreach (int i = 0; i < n_str.Length; i++){
      n_arr[i] = (n_str[i] - '0') * (n_str[i] - '0');
      result += Convert.ToString(n_arr[i]);
    }
    
    return Convert.ToInt32(result);
  }
}