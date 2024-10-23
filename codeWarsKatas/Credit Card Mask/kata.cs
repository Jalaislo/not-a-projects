using System;

public static class Kata
{
  public static string Maskify(string cc)
  {
    if (cc.Length <= 4)
      return cc;

      char[] char_cc = cc.ToCharArray();
      Array.Reverse(char_cc);

      for (int i = 0; i < cc.Length; ++i){
        if (i >=4)
        char_cc[i] = '#';
      }

      Array.Reverse(char_cc);
      return new string (char_cc);
  }
}