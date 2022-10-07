import java.util.Scanner;
import java.lang.Math;
class First
{
 public static void main(String ar[])
 {
  double a,b,c,d;
  Scanner o1=new Scanner(System.in);
  a=o1.nextDouble();
  b=o1.nextDouble();
  c=o1.nextDouble();
  d=Math.pow(a,b)+Math.pow(a,c);
  System.out.print(d);
}
}