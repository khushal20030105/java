import java.util.Scanner;
class First
{
 public static void main(String ar[])
 {
  Scanner o1=new Scanner(System.in);
   int n;
   n=o1.nextInt();
   if(n%2==0)
   {
    System.out.print("Even "+n);
   }
   else
   {
    System.out.print("odd "+n);
   }
 }
}