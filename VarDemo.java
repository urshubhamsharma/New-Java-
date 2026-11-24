class VarDemo
{
  public static void main(String[] args)
  {
    int var=10;
    int var1=20,var2=var1+30,var3=var1+var2;
    System.out.println(var);
    System.out.println(var1+var2+var3);

    if(var3>var)
    {
     int var4=100;
     System.out.println(var3+" is greater than "+ var);
    }
    
       else
       {
        int var5=200;
        System.out.println(var+" is greater than "+var3);
       }
       

  }



}