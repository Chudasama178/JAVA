import java.util.ArrayList;
import java.util.Iterator;

public class ItretorDemo {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Rahul");
        a1.add("Kiran");
        a1.add("Atul");
        a1.add("Ramesh");
        a1.add("Bhautik");
        a1.add("Ronak");
        a1.add("Vishal");
        System.out.print("Content in List::");
        Iterator<String> itr = a1.iterator();
        while(itr.hasNext()){
            Object element = itr.next();
            System.out.print(element+" ");
        }
    }
}
