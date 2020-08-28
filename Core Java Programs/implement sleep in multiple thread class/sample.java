class A extends Thread{
  public void run(){
   for(int i=0;i<9;i++){
     try{
       if(i==4){
        Thread.sleep(5000);
      }
       System.out.println("The value in A is :"+i);
     }
     catch(InterruptedException c){}
    }
  }
}
class B extends Thread{
  public void run(){
   for(int i=0;i<9;i++){
       System.out.println("The value in B is :"+i);
     }
  }
}
class sample
{
  public static void main(String args[]){
  A a = new A();
  B b = new B();
  a.start();
  b.start();
 }
} 