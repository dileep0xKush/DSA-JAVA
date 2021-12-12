import java.awt.*;
import java.util.Scanner;
public class _06_While_loop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();

        int i=1;
        while (i<=a){
            System.out.println(i);
            i++;
        }
    }
}
