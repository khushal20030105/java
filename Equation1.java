import java.util.Scanner;
import java.lang.Math;
class First
{
 public static void main(String ar[])
 {
  double a,b,c,qe,qe1;
  Scanner o1=new Scanner(System.in);
  a=o1.nextDouble();
  b=o1.nextDouble();
  c=o1.nextDouble();
  qe=-b+Math.sqrt(b*b-(4.0*a*c))/(2.0*a);
  qe1=-b-Math.sqrt(b*b-(4.0*a*c))/(2.0*a);
  System.out.print(qe+"  "+qe1);
 }
}
  