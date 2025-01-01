
import java.util.Scanner;

public class StringClass {

    public static void main(String[] args) {
        // String word2 = new String("Java Hello World");
        // String word1 = new String(word2);
        // System.out.println(word1);
        try (Scanner sc = new Scanner(System.in)) {
            // String word2 = new String("Java Hello World");
            // String word1 = new String(word2);
            // System.out.println(word1);
            String word = "Rahul Chuadasama ";
            String word1 = "Kiran Dabhi ";
            int num=1;
            // int len = word.length();
            System.out.println("Length of word is::" + word.length());
            System.out.println("Charecter at index of :" + word.charAt(2));
            System.out.println("Substring from Charecter i to j :" + word.strip());
            System.out.println("Substring from Charecter i to j :" + word.substring(0,5));
            System.out.println("Concat Two string::"+ word+word1);
            String result = word+word1;
            result += num;
            System.out.println("Concat Two string::"+ result);
            String newStr = sc.nextLine();
            StringBuffer str = new StringBuffer(newStr);
            str.reverse();
            System.out.println("Reverse of given string::"+ str);
        }
    }

}
