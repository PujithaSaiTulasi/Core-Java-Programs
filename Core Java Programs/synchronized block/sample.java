class reserve implements Runnable{
 int wanted,available=5;
 reserve(int i){
  wanted = i;
 }
 public void run(){
  synchronized(this){
  System.out.println("Available tickets are:"+available);
   if(available>=wanted){
    System.out.println("Booked "+wanted+" ticket to "+Thread.currentThread().getName());
    available = available-wanted;
    }
   else{
    System.out.println("Sorry tickets are not available:");
   }
  }
 }
} 
class sample{
 public static void main(String args[]){
  reserve r = new reserve(5);
  Thread t1 = new Thread(r);
  Thread t2 = new Thread(r);
  t1.setName("One");
  t2.setName("TWo");
  t1.start();
  t2.start();
 }
}