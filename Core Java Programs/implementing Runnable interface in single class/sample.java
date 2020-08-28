public class sample implements Runnable
{
  public void run(){
   for(int i=0;i<5;i++){
     System.out.println("i value is :"+i);
    }
  }

public static void main(String args[]){
  sample s = new sample();
  Thread t1=new Thread(s);
  Thread t2=new Thread(s);
  t1.start();
  t2.start();
  }
} 