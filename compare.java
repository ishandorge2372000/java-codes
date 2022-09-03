import java.util.Scanner;
class InvalidStringsException extends Exception
{

}
public class compare
{
   public static void main(String argsp[])
   {
      String name=new String("IshanDorge");
      String password=new String("Ishan");
      try
      { 
        if(name.compareTo(password)==0)
         System.out.println("same");
        else
         throw new InvalidStringsException();
      }
      catch(InvalidStringsException iv)
      {
         System.out.println("Unequal");
      }
   }
}
