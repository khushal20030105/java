import java.util.Scanner;
class First
{
 public static void main(String ar[])
 {
  int a;
  Scanner o1=new Scanner(System.in);
  a=o1.nextInt();
  if(a>0)
  {
   System.out.print("Positive");
  }
  else
  {
   System.out.print("Negative");
  }
 }
}