
import java.util.*;
public class LinkedListClassDemo {
    public static void main(String[] args) {
        // List intreface implements LinkedList
        // LinkedList
        try (Scanner sc = new Scanner(System.in)) {
        List<String> l1 = new LinkedList<String>();
            System.out.print("Enter number for how much element you went to take in input::");
            int n = sc.nextInt();
            for(int i=1;i<=n;i++){
                System.out.print("Enter your element "+i+" :");
                String element = sc.next();
                l1.add(element);
            }
            System.out.println("LinkedList elements::");
            System.out.print("\t"+l1);


        } catch (Exception e) {

        }
    }

}
