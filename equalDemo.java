class equalDemo 
{
    public static void main(String args[]) 
   {
      String s1 ="Hello";
      String s2 ="Hello";
      String s3 = "Good-bye";
      String s4 = "HELLO";
      System.out.println(s1 + " equals " + s2 + " ->"+s1.equals(s2));
      System.out.println(s1 + " equals " + s3 + " ->"+s1.equals(s3));
      System.out.println(s1 + " equals " + s4 + " ->"+s1.equals(s4));
      System.out.println(s1 + " equalsIgnoreCase "+s4 +"->" +s1.equalsIgnoreCase(s4));
      System.out.println("s1==s1:"+(s1==s2));
   }
}
/*Hello equals Hello ->true
Hello equals Good-bye ->false
Hello equals HELLO ->false
Hello equalsIgnoreCase HELLO->true
s1==s1:true
*/

/*ex2

String s1 =new String ("Hello");
String s2 ="Hello";
System.out.println("s1==s2"+(s1==s2)); //false
*/

