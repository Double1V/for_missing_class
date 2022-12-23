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