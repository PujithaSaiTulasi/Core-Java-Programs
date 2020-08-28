class A implements Runnable
{
  public void run(){
   for(int i=0;i<5;i++){
     System.out.println("The value in A is :"+i);
    }
  }
}
class B implements Runnable
{
  public void run(){
   for(int i=0;i<5;i++){
     System.out.println("The value in B is :"+i);
    }
  }
}
class C implements Runnable
{
  public void run(){
   for(int i=0;i<5;i++){
     System.out.println("The value in C is :"+i);
    }
  }
}
class sample
{
  public static void main(String args[]){
  A a = new A();
  B b = new B();
  C c = new C();
  Thread t1=new Thread(a);
  Thread t2=new Thread(b);
  Thread t3=new Thread(c);
  t1.start();
  t2.start();
  t3.start();
  }
} 