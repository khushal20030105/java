import java.util.Scanner;
class First
{
 public static void main(String ar[])
 {
  int a,b,c,d;
  Scanner o1=new Scanner(System.in);
  a=o1.nextInt();
  b=o1.nextInt();
  c=a+b;
  d=c/50*100;
  if(d>=40)
  {
   System.out.print("Pass");
  }
  else 
  {
   System.out.print("Fail");
  }
 }
}