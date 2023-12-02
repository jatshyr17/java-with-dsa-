import java.util.Scanner;

public class practice2 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
         System.out.print("Enter the number-");
         double num1 = input.nextInt();
         System.out.print("Enter the second number-");
         double num2=input.nextInt();
         if(num1>num2){
             System.out.println(num1);}
         else{
             System.out.println(num2);
       }
    }
}
