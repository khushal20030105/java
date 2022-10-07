import java.util.Scanner;
import java.lang.Math;
class First
{
 public static void main(String ar[])
 {
  double a,b,r,z;
  Scanner o1=new Scanner(System.in);
  a=o1.nextDouble();
  b=o1.nextDouble();
  r=Math.pow(a,2)-Math.pow(b,2);
  z=Math.sqrt(r);
  System.out.print(z);
 }
}