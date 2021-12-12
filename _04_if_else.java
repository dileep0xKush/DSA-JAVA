import java.util.Scanner;
public class _04_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        if(a>5)
//        {
//            System.out.println("greater than 5");
//        }
//        else
//         {
//            System.out.println("less than five");
//        }
        if(a==5){
            System.out.println("equal");

        }
        else if(a>5){
            System.out.println("greater than 5");
        }
        else {
            System.out.println("less than 5");
        }
    }
}
