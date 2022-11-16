import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("Enter number n to find nth element of a Fibonacci series: ");
        int find = in.nextInt();

        System.out.println(fibonacci(find));
    }
    static int fibonacci(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}