import java.util.Scanner;
class First
{ 
 public static void main(String ar[])
 {
  Scanner o1=new Scanner(System.in);
  int a,b,c,d,e,f;
  System.out.print("Enter a Number :");
  a=o1.nextInt();
  System.out.print("Enter b Number :");
  b=o1.nextInt();
  c=a+b;
  d=a-b;
  e=a*b;
  f=a/b;
  System.out.println("Add="+c);
  System.out.println("Sub="+d);
  System.out.println("Mul="+e);
  System.out.println("Div="+f);
 }
}