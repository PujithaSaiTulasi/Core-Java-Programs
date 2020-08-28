import java.io.*;
class sample{
 public static void main(String args[]){
  try{
   File f = new File("C:\\Users\\Vignan\\Desktop\\576\\mine1.txt");
   FileOutputStream fw = new FileOutputStream (f,true);
   String s = "Welcome to JAVA!";
   byte[] b = s.getBytes();
   fw.write(b);
   System.out.println("Writing operation Succesful!!");
   fw.close();
  }
  catch(IOException e){
  System.out.println(e);
  }
 }
}
