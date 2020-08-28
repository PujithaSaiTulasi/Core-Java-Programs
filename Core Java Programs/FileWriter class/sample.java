import java.io.*;
class sample{
 public static void main(String args[]){
  try{
   File f = new File("C:\\Users\\Vignan\\Desktop\\576\\FileWriter class\\mine1.txt");
   //FileWriter fw = new FileWriter(f);//only writing
   FileWriter fw = new FileWriter(f,true);//appends
   fw.write("This is done by Prudhvi");
   System.out.println("Writing operation succesful!!");
   fw.close();
  }
  catch(IOException e){
  }
 }
}