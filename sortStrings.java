class sortStrings
{
   public static void main(String args[])
   {
      int i,j;
      String temp;
      String name[]=new String[3];
      name[0]=new String("Ishan");
      name[1]=new String("Bhushan");
      name[2]=new String("Abhishek");
      for(i=2;i>=0;i--)
      {
        for(j=0;j<i;j++)
        {
          if( (name[i].compareTo(name[j])) < 0)
          {
             temp=name[j];
             name[j]=name[j+1];
             name[j+1]=temp;
          }
        }
      }
     for(i=0;i<=2;i++)
     {
        System.out.println(name[i]);
     }
   }
}
