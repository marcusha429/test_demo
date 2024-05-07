import java.util.Arrays;

class leetcode {
    public static void main(String[] args) {
        System.out.println("Hello Anh");
        System.out.println("Fibonancci code");
        int n = 10;
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }


    // public static String encrypt (String plainText, int shift) {
    //     // char c;
    //     int a = (char) 'c';
    //     for (int i = 0; i < plainText.length(); i++) {
    //         char current = plainText.charAt(i);
    //     }
    //     return "";
    // }
}