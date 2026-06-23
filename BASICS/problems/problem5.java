// Calculate total and average of 5 subject marks
import java.util.Scanner;
public class problem5 {
 public static void main (String args []){
    Scanner sc = new Scanner(System.in);
    System.out.println ("enter first subject marks");
    int mark1 =sc.nextInt ();
        System.out.println ("enter second subject marks");
         int mark2 =sc.nextInt ();
        System.out.println ("enter third subject marks");
         int mark3 =sc.nextInt ();
         System.out.println ("enter fourth subject marks");
          int mark4 =sc.nextInt ();
         System.out.println ("enter fifth subject marks");
          int mark5 =sc.nextInt ();
          int total = mark1+mark2+mark3+mark4+mark5;
          System.out.println("total marks is : "+total);
          int average = ( mark1+mark2+mark3+mark4+mark5)/5;
          System.err.println("average marks is "+average);
                   

 }   
}
