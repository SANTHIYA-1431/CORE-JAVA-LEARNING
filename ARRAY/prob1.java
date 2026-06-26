//get input for 5 numbers using array and for loop
// package ARRAY;
import java.util.Scanner;
public class prob1 {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in ); 
   int[] marks = new int[5] ;
    
   for (int i=0;i<=4;i++){
    
   System.out.print ("enter the marks : ");
   marks[i]=sc.nextInt ();}
   for (int i=0;i<=4;i++){
   System.out.println ("marks are :"+marks[i]);}
}}
