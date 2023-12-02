
import java.util.Scanner;
public class TypeCasting{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//         float a= input.nextFloat();
//         System.out.println(a);
//     }
// }
// 890

//narrowing conversion
// import java.util.Scanner;
// public class TypeCasting{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         int num = (int)(67.78f);
//         System.out.println(num);

//     }
// }/

//type promotion
byte b=42;
char c='a';
short s=1024;
int i =50000;
float f=5.67f;
double d = 0.1234;
double result = ( f * b ) + ( i / c ) - ( d * s );
//float * byte = float
//integer/char = integer
//double * short= double 
// float * int - double = double 
System.out.println((f * b ) + " "+ ( i / c ) + " " + ( d * s ) );
System.out.println(result);
    }
}
