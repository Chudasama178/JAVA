
import java.util.Scanner;

public class Index{
    public static void main(String[] args) {
        int n1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Your Number:");
            n1 = sc.nextInt();
        }
        System.out.println(n1);
        
    }
}