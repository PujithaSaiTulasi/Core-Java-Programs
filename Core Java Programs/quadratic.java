class quadratic
{
  public static void main(String []args)
  {               int a=3,b=4,c=5;
               double r1,r2,D;
                D=b*b-4*a*c;
              if(D>0)
             {
                System.out.println("roots are real and unequal");
                r1=(-b+Math.sqrt(D))/(2*a);
               r2=(-b-Math.sqrt(D))/(2*a);
              System.out.println("1st root "+r1);
             System.out.println("2nd root "+r2);
               }

               else if(D==0)
           {
                 System.out.println("roots are real and equal");
                 r1=(-b+Math.sqrt(D))/(2*a);
              }

           else
              {
                     System.out.println("roots are imaginary");
               }


  }

}