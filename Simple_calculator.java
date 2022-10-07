import java.util.Scanner;
class First
{
 public static void main(String ar[])
 {
  int a,b,c,d,e,f;
  char x; 
  Scanner o1=new Scanner(System.in);
  System.out.print("Enter A Number :");
  a=o1.nextInt();
  System.out.print("Enter B Number :");
  b=o1.nextInt();
  System.out.print("Enter any one +,-,*,/ :");
  x=o1.next().charAt(0);
  switch(x)
  {
   case '+':
   c=a+b;
   System.out.print("Add :"+c);
   break;
   case '-':
   d=a-b;
   System.out.print("Subtract :"+d);
   break;
   case '*':
   e=a*b;
   System.out.print("Multiply :"+e);
   break;
   case '/':
   f=a/b;
   System.out.print("Divide :"+f);
   break;
   default:
   System.out.print("Choice Correct Option");
   break;
  }
 }
}