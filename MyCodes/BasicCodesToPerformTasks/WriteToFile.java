//package basicjavatutorial; 
 import java.util.*; 
 import java.io.BufferedReader; 
 import java.io.BufferedWriter; 
 import java.io.File; 
 import java.io.FileNotFoundException; 
 import java.io.FileReader; 
 import java.io.FileWriter; 
 import java.io.IOException; 
 import java.lang.*; 
 public class WriteToFile { 
        public static void main(String args[]) throws IOException{ 
                  try{ 
                           // Create file  
                         // FileWriter fstream = new FileWriter("D:/writeFile.txt"); 
                          FileWriter fstream = new FileWriter("C:\\Users\\yashu\\Desktop\\writefile.txt"); 
                          
                         // C:\Users\nsare1\Desktop
                           BufferedWriter out = new BufferedWriter(fstream); 
                           out.write("Hello Java"+"\n"+"Hello Activitiy"); 
                           //Close the output stream 
                           out.close();  
                           System.out.println("File Write Completed.");
                           }catch (Exception e){//Catch exception if any 
                          System.err.println("Error: " + e.getMessage());                            } 
                            
         } 
 } 


