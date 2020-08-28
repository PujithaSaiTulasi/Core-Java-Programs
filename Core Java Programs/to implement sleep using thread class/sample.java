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
class sample
{
  public static void main(String args[]){
  A a = new A();
  a.start();
 }
} 