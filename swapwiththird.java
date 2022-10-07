import java.util.Scanner;
class First
{ 
 public static void main(String ar[])
 {
  int a,b,c;
  Scanner o1=new Scanner(System.in);
  System.out.print("Enter a Number :");
  a=o1.nextInt();
  System.out.print("Enter b Number :");
  b=o1.nextInt();
  c=a;
  a=b;
  b=c;
  System.out.print(a+"  "+b);
 }
}
  