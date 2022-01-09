import java.util.Scanner;
import java.util.*;

public class _11_Function {
//    public static void printArray(String name){
//        System.out.println(name);
//        return;
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        printArray(name);
//    }

//    2. print two number sum
//    public static int twoSum(int a,int b){
//        int sum= a + b;
//        return sum;
//    }
//
//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b =sc.nextInt();
//     int sum = twoSum(a,b);
//        System.out.println(sum);
//    }
//    3.ptint factorial
    public static void printFactorial(int n){
        if (n<0){
            System.out.println("invalid");
        }
        int fact= 1;
        for (int i=n;i>1;i--){
            fact = fact*i;

        }
        System.out.println(fact);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        printFactorial(n);
    }
}
