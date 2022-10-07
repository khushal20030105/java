import java.util.Scanner;
class First
{
 public static void main(String ar[])
 { 
  int a,b,c;
  Scanner o1=new Scanner(System.in);
  a=o1.nextInt();
  b=o1.nextInt();
  c=o1.nextInt();

  if(a>b && a>c)
  { 
   System.out.print("A is Greater than B & C");
  }
  else if(b>a && b>c)
  {
   System.out.print("B is Greater than A & C");
  }
  else
  {
   System.out.print("C is Greater than A & B");
  }
 }
}