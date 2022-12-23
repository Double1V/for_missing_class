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

## kata task2
[Task link](https://www.codewars.com/kata/564057bc348c7200bd0000ff)    
My solution
```java
public class Thirteen {

    public static long newNumber(long n) {
        String s = "";
        while(n > 0) {
            s += n % 10;
            n /= 10;
        }
        int arr[] = {1, 10, 9, 12, 3, 4};

        for(int i=0; i < s.length(); i++) {
            n += (s.charAt(i) - '0') * arr[i % 6];
        }
        return n;
    }

    public static long thirt(long n) {

        while(n != newNumber(n)) {
            n = newNumber(n);
        }
        return n;
    }
}
```

My fav solution
```java
class Thirteen {
    
    private static final int[] seq = new int[]{1,10,9,12,3,4};
    
    public static long thirt(long n) {
        
        long v = 0, m = n;
        int p = 0;
        while (m>0) {
            v += (m%10)*seq[p++%6];
            m /= 10;
        }
        return v == n ? v : thirt(v);
        
    }
}
```
