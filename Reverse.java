import java.util.Scanner;
class First
{
 public static void main(String ar[])
 {
  int a,b,c,d,i;
  a=123;
  b=a%10;
  a=a/10;
  c=a%10;
  a=a/10;
  d=a%10;
  a=a/10;
  i=b*100+c*10+d*1;
  System.out.print(i);
 }
}