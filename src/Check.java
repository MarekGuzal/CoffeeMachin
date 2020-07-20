import java.util.Scanner;

public class Check {

        public static double divide(long a, long b) {
            double division =(double) a / (double) b;
            if(b != 0){
            }
            return division;
            // write your code here
        }

        /* Do not change code below */
        public static void main(String[] args) {
            final Scanner scanner = new Scanner(System.in);
            final long a = scanner.nextLong();
            final long b = scanner.nextLong();
            System.out.println(divide(a, b));
        }
    }

