
import java.util.Scanner;

public class MathClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your A::");
        int a = sc.nextInt();
        System.out.print("Enter Your B::");
        double b = sc.nextDouble();
        System.out.println(Math.abs(b));
        System.out.println(Math.min(a, b));
        System.out.println(Math.max(a, b));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.pow(a, 3));
        System.out.println(Math.floor(b));
        System.out.println(Math.ceil(b));
        System.out.println(Math.random());
    }

}
