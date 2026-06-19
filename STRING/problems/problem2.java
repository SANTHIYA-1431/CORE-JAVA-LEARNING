/* 2. Print the first, middle, and last character of a string.
   Topics: charAt(), length(), if-else
 */
import java.util.*;
public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string :");
        String str = sc.nextLine();
         char first =str.charAt(0);
        System.out.println("first letter : "+first);
        int length = str.length();
        char last = str.charAt(length-1);
        System.out.println("final : "+last);
        if (length % 2==0) {
            char mid1 = str.charAt(length/2-1);
            char mid2 = str.charAt(length/2); 
        System.out.println("mid1 :"+mid1 );
    System.out.println("mid2"+mid2);}
            else {
                System.out.println("middle :"+str.charAt(length/2));
            }


    }
}
