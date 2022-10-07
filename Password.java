import java.util.Scanner;
class First
{ 
 public static void main(String ar[])
 {
  int a,b;
  Scanner o1=new Scanner(System.in);
  a=2003;
  System.out.print("Enter Password :");
  b=o1.nextInt();
  if(a==b)
  {
   System.out.print("Password is Correct");
  }
  else
  {
   System.out.print("Password is not Correct");
  }
 }
}


