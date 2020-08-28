class A extends Thread{
 public void run(){
  for(int i=1;i<=5;i++){
   System.out.println("IN CLASS A: "+i);
  }
 }
}
class B extends Thread{
 public void run(){
  for(int i=1;i<=5;i++){
   System.out.println("IN CLASS B: "+i);
  }
 }
}

class sample{
 public static void main(String args[]){
  A a = new A();
  B b = new B();
  a.start();
  b.start();
  try{ 
   a.suspend();
   Thread.sleep(5000);
   a.resume();
  }
  catch(InterruptedException e){
  System.out.println(e);
  }
 }
}