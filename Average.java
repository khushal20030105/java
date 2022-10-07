import java.util.Scanner;
import java.lang.Math;
class First
{
 public static void main(String ar[])
 {
  int a,b,c,d;
  Scanner o1=new Scanner(System.in);
  System.out.print("Enter a Number :");
  a=o1.nextInt();
  System.out.print("Enter b Number :");
  b=o1.nextInt();
  System.out.print("Enter c Number :");
  c=o1.nextInt();
  d=a+b+c/3;
  System.out.print(d);
 }
}