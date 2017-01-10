package com.thb.TaskThird;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GetKeyGetValueCSVReadWriteAndHashMap {

        /*        Create a csv with entires like : csv content as follows : 
                a,apple
                b,bat
                c,cat
                d,dog
                Read the csv line by line .
                put it in hashmap as 'a' as key and 'apple' as value and similarly  . 
                Then for each of the values like apple , bat , cat should be converted to upper case . 
                print the hashmap on java console . 
                output the final hashmap as separate file on your system ( you may use github file write code for this particular write stuff , if at all you want ) 
         */

        public static void main(String[] args) {
                try{
                        Map<String,String> mapOfKeyAndUpperCaseValueReturn = new HashMap<String, String>();

                        mapOfKeyAndUpperCaseValueReturn= returnHashMap();
                        System.out.println("returned map is "+mapOfKeyAndUpperCaseValueReturn);


                        // Create file  
                        FileWriter fstream = new FileWriter("C:\\Users\\nsare1\\Desktop\\writefile.txt"); 

                        // C:\Users\nsare1\Desktop
                        BufferedWriter out = new BufferedWriter(fstream); 
                        // out.write("Hello Java"+"\n"+"Hello Activitiy"); 


                        Iterator<Entry<String,String>> itr=mapOfKeyAndUpperCaseValueReturn.entrySet().iterator();
                        while (itr.hasNext()) {
                                Map.Entry<String, String> pairs = itr.next();
                                //.out.println("Value is " + pairs.getValue());

                                // since you only want the value, we only care about pairs.getValue(), which is written to out
                                out.write(pairs.getKey()+","+pairs.getValue()+ "\n");



                        }

                        // giving complie time errors in printing hashmap.
                        // out.write (mapOfKeyAndUpperCaseValueReturn);



                        //Close the output stream 
                        out.close();  
                        System.out.println("File Write Completed.");




                }catch (Exception e) {
                        // TODO: handle exception
                        System.out.println("catch in main called.");
                }
        }



        public static        Map<String,String> returnHashMap()throws FileNotFoundException,IOException {
                Map<String,String> mapOfKeyAndUpperCaseValue = new HashMap<String, String>();
                try{
                        File file = new File("C:\\Users\\nsare1\\Desktop\\TaskThird.csv");
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                        String line = "";
                        String str = "";
                        while((line=bufferedReader.readLine())!=null){
                                System.out.println("line : "+line);
                                String[] arrayOfSplittedline = line.trim().split(",");
                                String ActualValue=arrayOfSplittedline[1];
                                String upperCaseValue=ActualValue.toUpperCase();
                                mapOfKeyAndUpperCaseValue.put(arrayOfSplittedline[0], upperCaseValue);

                        }
                }catch (FileNotFoundException e) {
                        // TODO: handle exception
                        System.out.println("File not found.");
                }
                System.out.println("mapOfKeyAndUpperCaseValue is"+mapOfKeyAndUpperCaseValue);

                return mapOfKeyAndUpperCaseValue;
        }


}


/*---Output  GetKeyGetValueCSVReadWriteAndHashMap
line : a,apple
line : b,bat
line : c,cat
line : d,dog
mapOfKeyAndUpperCaseValue is{d=DOG, b=BAT, c=CAT, a=APPLE}
returned map is {d=DOG, b=BAT, c=CAT, a=APPLE}
File Write Completed.
*/
