class compareString
{
   public static void main(String args[])
   {
      String s1 =new String("Hello");
      String s2 ="Hello";
      String s3 = "Good-bye";
      String s4 = "HELLO";
      System.out.println(s1 + " compareTo " + s2 + " ->"+s1.compareTo(s2));// 0 equal
      System.out.println(s1 + " compareTo " + s3 + " ->"+s1.compareTo(s3));//1
      System.out.println(s3+ " compareTo " + s1 + " ->"+s3.compareTo(s1));
   }
}
