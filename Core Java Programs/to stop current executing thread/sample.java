class A extends Thread
{
  public void run(){
   for(int i=0;i<5;i++){
     if(i==3) stop();
     System.out.println("The value in A is :"+i);
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