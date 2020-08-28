import java.util.*;
class pasarrayasargument
{
  void bubblsort(int a[])
    {
    for(int i=0;i<a.length;i++)
    {
    for(int j=0;j<a.length-1;j++)
     {
       if(a[j]>a[j+1])
         {
           a[j]=a[j]+a[j+1]-(a[j+1]=a[j]);
          }
     }
    }
    System.out.println("After sorting");
   for(int i=0;i<a.length;i++)
    {
       System.out.println(a[i]);
    }
}
  void sum(int a[])
  {
    int sum=0;
     for(int i=0;i<a.length;i++)
     {
       sum=sum+a[i];
     }
     System.out.println("sum of elements of an array:"+sum);
  }
  void display(int a[])
   {
     System.out.println("The elements of the array are:");
     for(int i=0;i<a.length;i++)
     {
       System.out.println(a[i]);
     }
   }
  public static void main(String args[])
 {
  
  Scanner s=new Scanner(System.in);
   pasarrayasargument p=new pasarrayasargument();
  System.out.println("Enter the number of elements");
  int n=s.nextInt();
  int a[]=new int[n];
  System.out.println("Enter the elements into an array");
  for(int i=0;i<n;i++)
  {
    a[i]=s.nextInt();
  }
  p.display(a);
  p.sum(a);
  p.bubblsort(a);
 }
}