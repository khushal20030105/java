import java.util.Scanner;
class First
{
 public static void main(String ar[])
 {
  int a,b;
  Scanner o1=new Scanner(System.in);
  System.out.print("Enter a Number :");
  a=o1.nextInt();
  switch(a)
  {
   case 1:
   System.out.print("One");
   break;
   case 2:
   System.out.print("Two");
   break;
   case 3:
   System.out.print("Three");
   break;
   case 4:
   System.out.print("Four");
   break;
   case 5:
   System.out.print("Five");
   break;
   case 6:
   System.out.print("Six");
   break;
   case 7:
   System.out.print("Seven");
   break;
   case 8:
   System.out.print("Eight");
   break;
   case 9:
   System.out.print("Nine");
   break;
   case 10:
   System.out.print("Ten");
   break;
   default:
   System.out.print("Invalid Number");
   break;
   }
 }
}