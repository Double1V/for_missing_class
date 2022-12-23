# for_missing_class
## kata task1
[Task link](https://www.codewars.com/kata/5264d2b162488dc400000001)    
My solution
```java
public class SpinWords {

    public static String reverse(String str) {
        String result = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static String spinWords(String sentence) {
        String[] Split = sentence.split(" ");
        String result = "";
        for(int i=0; i < Split.length; i++) {
            if(Split[i].length() > 4) {
                result += reverse(Split[i]);
            }
            else {
                result += Split[i];
            }
            if(i != Split.length - 1) {
                result += ' ';
            }
        }
        return result;
    }
}
```

My fav solution
```java
import java.util.Arrays;

public class SpinWords {

  public String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    for (int i=0; i<words.length; i++) {
      if (words[i].length() >= 5) {
        words[i] = new StringBuilder(words[i]).reverse().toString();
      }
    }
    return String.join(" ",words);
  }
}
```
