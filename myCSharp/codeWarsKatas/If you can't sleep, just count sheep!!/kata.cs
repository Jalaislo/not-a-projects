using System;

public static class Kata
{
  public static string CountSheep(int n)
  {
    string sheeps = "";
    for (int i = 1; i <= n; ++i){
      sheeps += Convert.ToString(i) + " sheep...";
    }
    
    return sheeps;
  }
}