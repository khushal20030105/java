import java.util.Scanner;
class First
{
 public static void main(String ar[])
 {
  double a,b,c,d,e,f;
  Scanner o1=new Scanner(System.in);
  System.out.print("Enter Math Marks :");
  a=o1.nextDouble();
  System.out.print("Enter Java Marks :");
  b=o1.nextDouble();
  System.out.print("Enter Python Marks :");
  c=o1.nextDouble();
  System.out.print("Enter Cloud Computing Marks :");
  d=o1.nextDouble();
  e=a+b+c+d;
  f=e/400*100;
  if(f>=90)
  {
   System.out.print("Grade A");
  }
  else if(f>=80)
  {
   System.out.print("Grade b");
  }
  else if(f>=70)
  {
   System.out.print("Grade c");
  }
  else if(f>=60)
  {
   System.out.print("Grade d");
  }
  else if(f>=50)
  {
   System.out.print("Grade e");
  }
  else if(f>=40)
  {
   System.out.print("Grade f");
  }
  else
  {
   System.out.print("Fail");
  }
 }
}