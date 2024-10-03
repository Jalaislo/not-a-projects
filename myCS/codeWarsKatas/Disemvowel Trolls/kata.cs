using System;

public static class Kata
{
    public static string Disemvowel(string str)
    {
        string vowels = "aeiouAEIOU";
        string result = "";
        
        for (int i = 0; i < str.Length; ++i){
          if (vowels.Contains(str[i]) == false)
            result += Convert.ToString(str[i]);
        }
      
        return result;
    }
}