import java.util.Scanner;
class First
{
 public static void main(String ar[])
 {
  int a,b,c,d;
  Scanner o1=new Scanner(System.in);
  a=o1.nextInt();
  b=o1.nextInt();
  c=a/b;
  d=a%b;
  System.out.print(c+" "+d);
 }
}