//Calculate perimeter of a square
import java.util.Scanner;
public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the side length : ");
        int length = sc.nextInt ();
        int perimeter = 4*length;
        System.out.println("perimeter of the square is :"+perimeter);
    }
}
