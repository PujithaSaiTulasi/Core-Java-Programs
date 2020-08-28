class A extends Thread{
  public void run(){
   for(int i=0;i<6;i++){
       System.out.println("The value in A is :"+i);
     }
  }
}
class B extends Thread{
  public void run(){
   for(int i=0;i<6;i++){
       System.out.println("The value in B is :"+i);
     }
  }
}
class C extends Thread{
  public void run(){
   for(int i=0;i<6;i++){
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
  a.setPriority(Thread.MAX_PRIORITY);
  b.setPriority(Thread.MIN_PRIORITY);
  c.setPriority(Thread.NORM_PRIORITY);
  a.start();
  b.start();
  c.start();
 }
} 