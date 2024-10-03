using System;
using System.Collections.Generic;
using System.Linq;

public static class Kata 
{
    public static IEnumerable<string> FriendOrFoe (string[] names) 
    {
        return names.Where(e => e.Length == 4);
    }
}