
/* 1. Take a full name as input and print:
   - Original name
   - Length
   - Uppercase version*/
import java.util.*;
public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name : ");
        String name = sc.nextLine();
        System.out.println("length :"+name.length());
        System.out.println("upper case version :"+name.toUpperCase());
    }
}
