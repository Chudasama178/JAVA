
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraylistClass {

    public static void main(String[] args) {
        // List intreface implements ArrayList,Vector,Stack,ArrayDeque Class
        // ArrayList
        List<Integer> a1 = new ArrayList();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("How much elements you went to take in input::");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter your elements of index " + i + " :");
                int number = sc.nextInt();
                a1.add(number);

            }

            Object aa1 = a1.toArray();
            System.out.println("Before" + a1);
            System.out.println(a1.contains(11));
            System.out.println(a1.isEmpty());
            System.out.println(a1.indexOf(11));
            System.out.println("Size of ArrayList::" + a1.size());
            System.out.println(a1.get(2));
            System.out.println(a1.remove(2));
            System.out.println(a1.equals(aa1));
            System.out.println(a1.getClass());
            System.out.println("After" + a1);
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
