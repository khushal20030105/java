import java.util.*;
class First
{
 public static void main(String[] ar)
 {
  int a;
  Scanner o1=new Scanner(System.in);
  a=o1.nextInt();
  if(a%5==0 && a%11==0)
  {
   System.out.print("Divisible by 5 and 11");
  }
  else
  {
   System.out.print("Not Divisible by 5 and 11");
  }
 }
}