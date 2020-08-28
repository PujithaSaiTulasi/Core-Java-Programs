import java.io.*;
class sample{
 public static void main(String args[]){
  try{
   File f = new File("C:\\Users\\Vignan\\Desktop\\576\\mine.txt");
   FileReader fw = new FileReader(f);
   int ch;
   while((ch=fw.read())!=-1){
    System.out.print((char)ch);
   }
  }
  catch(IOException e){
  System.out.println("File Not Found!!");
  }
 }
}