import java.util.Scanner;
	class Main
{
 public static void main(String ar[])
 {
  Scanner scan=new Scanner(System.in);
  System.out.print("Enter String :");
  String atr=scan.nextLine();
  if (atr.equals(atr.toUpperCase()))
  {
   System.out.println("Uppercase");
  }
  else
  { 
   System.out.println("Not Uppercase ");
  }
  scan.close();
 }
}
