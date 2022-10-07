import java.util.Scanner;
class First
{ 
 public static void main(String ar[])
 {
  int a,b;
  Scanner o1=new Scanner(System.in);
  a=o1.nextInt();
  b=o1.nextInt();
  a=a+b;
  b=a-b;
  a=a-b;
  System.out.print(a+" "+b);
 }
}