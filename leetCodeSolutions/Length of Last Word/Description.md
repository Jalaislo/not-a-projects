# 58. Length of Last Word

Given a string `s` consisting of words and spaces, *return the length of the **last** word in the string*.

A **word** is a maximal substring consisting of non-space characters only.

> ### Example 1:
>> <p><strong>Input:</strong> s = "Hello World"<br>
>> <strong>Output:</strong> 5<br>
>> <strong>Explanation:</strong> The last word is "World" with length 5.</p>

> ### Example 2:
>> <p><strong>Input:</strong> s = "   fly me   to   the moon  "<br>
>> <strong>Output:</strong> 4<br>
>> <strong>Explanation:</strong> The last word is "moon" with length 4.</p>

> ### Example 3:
>> <p><strong>Input:</strong> s = "luffy is still joyboy"<br>
>> <strong>Output:</strong> 6<br>
>> <strong>Explanation:</strong> The last word is "joyboy" with length 6.</p>

### Constraints:

* `1 <= s.length <= 104`
* `s` consists of only English letters and spaces `' '`.
* There will be at least one word in `s`.