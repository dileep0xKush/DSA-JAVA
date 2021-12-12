import java.util.Scanner;
public class _07_Swtich {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        switch (a){
            case 1:
                System.out.println("Ram");
                break;
            case 2:
                System.out.println("Shyam");
                break;
            case 3:
                System.out.println("Ramu");
                break;
            case 4:
                System.out.println("Ramesh");
                break;
            case 5:
                System.out.println("Rajesh");
                break;
            default:
                System.out.println("defaults");
        }

    }
}
