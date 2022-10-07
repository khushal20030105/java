import java.util.Scanner;
import java.lang.Math;
class First
{
 public static void main(String ar[])
 {
  double s,a,b,c,area;
  a=20;
  b=10;
  c=20;
  s=a+b+c/2;
  area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
  System.out.print(area);
 }
}