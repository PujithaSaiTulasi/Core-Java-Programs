class producer extends Thread{
 StringBuffer sb;
 producer(){
 sb = new StringBuffer();
 }
 public void run(){
  synchronized(sb){
   for(int i=0;i<10;i++){
    sb.append(i);
    System.out.println("Appendeding "+i);
   }
  sb.notify();
  }
 }
}
class consumer extends Thread{
 producer p;
 consumer(producer p){
 this.p = p;
 }
 public void run(){
 synchronized(p.sb){
  try{
   p.sb.wait();
  }
  catch(InterruptedException e){
  }
  System.out.println("Data at consumer level:");
  System.out.println(p.sb);
  p.sb.delete(0,5);
  System.out.println(p.sb);
  }
 }
}  
class sample{
 public static void main(String args[]){
  producer p = new producer();
  consumer c = new consumer(p);
  Thread t1 = new Thread(p);
  Thread t2 = new Thread(c);  
  t2.start();
  t1.start();
 }
}