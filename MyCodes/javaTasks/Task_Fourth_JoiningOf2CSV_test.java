package com.thb.TaskFourth;

//package com.thb.TaskFourth;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class JoiningOf2CSV_test {




        /*task four : 
                refer to csv in task three 
                refer to this csv having contents like : 
                a,america
                b,britain
                c,canada
                d,delhi
                Then in that case , joininng on the basis of common keys like a,b concatenate them like apple-america , bat-britain , cat-canada and so on . Put those concatenated strings in a list . 
                print the list using itertaion . 
                output the list contents on a file on hard disc.
         */

         //assuming keys are distinct i m preferring to use HashMap as data structure.


        public static void main(String[] args){
                List<String>returnlistofkeyAndValueString=null;
                try{
                         
                         returnlistofkeyAndValueString=returnHashMapFirst();
                                System.out.println("returned list of keys & values is"+returnlistofkeyAndValueString);
                        //}
                        //System.out.println("");
                        // returnHashMapSecond();

                        
                }
                catch (Exception e) {
                        // TODO: handle exception
                }

                
        }



        static List<String> returnHashMapFirst()throws FileNotFoundException,IOException {
                Map<String,String> mapOfKeyAndUpperCaseValue = new HashMap<String, String>();
                Map<String,String> mapOfKeyAndValue = new HashMap<String, String>();
                List<String>listofkeyAndValueString=new ArrayList<String>();

                try{
                        try{
                                File file = new File("C:\\Users\\nsare1\\Desktop\\TaskThird.csv");
                                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                                String line = "";
                                String str = "";
                                while((line=bufferedReader.readLine())!=null){
                                        System.out.println("line of first csv is : "+line);
                                        String[] arrayOfSplittedline = line.trim().split(",");
                                        String ActualValue=arrayOfSplittedline[1];
                                        String upperCaseValue=ActualValue.toUpperCase();
                                        mapOfKeyAndUpperCaseValue.put(arrayOfSplittedline[0], upperCaseValue);

                                }
                        }catch (FileNotFoundException e) {
                                // TODO: handle exception
                                System.out.println("File not found.");
                        }
   System.out.println("");
                        File file = new File("C:\\Users\\nsare1\\Desktop\\TaskFourth.csv");
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                        String line = "";
                        String str = "";
                        while((line=bufferedReader.readLine())!=null){
                                System.out.println("line of second csv is  : "+line);
                                String[] arrayOfSplittedline = line.trim().split(",");
                                //String ActualValue=arrayOfSplittedline[1];
                                //String upperCaseValue=ActualValue.toUpperCase();
                                mapOfKeyAndValue.put(arrayOfSplittedline[0], arrayOfSplittedline[1]);

                        }
                        System.out.println("mapOfKeyAndUpperCaseValue is"+mapOfKeyAndUpperCaseValue);
                        System.out.println("mapOfKeyAndValue is"+mapOfKeyAndValue);


                        Iterator<Entry<String,String>> itr1=mapOfKeyAndUpperCaseValue.entrySet().iterator();
                        Iterator<Entry<String,String>> itr2=mapOfKeyAndValue.entrySet().iterator();

                        while (itr1.hasNext()) {
                                Map.Entry<String, String> pairs1 = itr1.next();
                                //.out.println("Value is " + pairs.getValue());
                                Map.Entry<String, String> pairs2 = itr2.next();
                                if(pairs1.getKey().equalsIgnoreCase(pairs2.getKey()))
                                {
                                        System.out.println(pairs1.getKey()+">>"+(pairs1.getValue()+"-"+pairs2.getValue()));
                                        listofkeyAndValueString.add(pairs1.getKey()+">>"+(pairs1.getValue()+"-"+pairs2.getValue()));
                                        //System.out.println("paired");
                                }
                        }
                        
                }
                
                catch (Exception e) {
                        // TODO: handle exception
                }         
                System.out.println(listofkeyAndValueString);
                return listofkeyAndValueString;
        }
}
// since you only want the value, we only care about pairs.getValue(), which is written to out
// out.write(pairs.getKey()+","+pairs.getValue()+ "\n");





/*        Set<String> keyset1=mapOfKeyAndUpperCaseValue.keySet();
                        Set<String> keyset2=mapOfKeyAndValue.keySet();

                         Iterator<String>itr1= keyset1.iterator();
                     Iterator<String>itr2=keyset2.iterator();




                        for (int i = 0; i < mapOfKeyAndUpperCaseValue.size(); i++) {

                                 while (itr1.hasNext()   ) {
                                        String key1 =itr1.next();
                                         while (itr2.hasNext()) {
                                        String key2=itr2.next();
                                        if(key1.equalsIgnoreCase(key2)){
                                                key1.
                                        }
                                         }*/






/*        }catch (FileNotFoundException e) {
                        // TODO: handle exception
                        System.out.println("File not found.");



                        //System.out.println("mapOfKeyAndUpperCaseValue is"+mapOfKeyAndUpperCaseValue);

                        //return mapOfKeyAndUpperCaseValue;
                }catch (Exception e) {
                        // TODO: handle exception
                }

        /*         static        Map<String,String> returnHashMapSecond()throws FileNotFoundException,IOException {
                                Map<String,String> mapOfKeyAndValue = new HashMap<String, String>();
                                try{
                                                                        }
                                System.out.println("mapOfKeyAndValue is"+mapOfKeyAndValue);

                                return mapOfKeyAndValue;
                        }


 */

/*  output--
line of first csv is : a,apple
line of first csv is : b,bat
line of first csv is : c,cat
line of first csv is : d,dog

line of second csv is  : a,america
line of second csv is  : b,britain
line of second csv is  : c,canada
line of second csv is  : d,delhi
mapOfKeyAndUpperCaseValue is{d=DOG, b=BAT, c=CAT, a=APPLE}
mapOfKeyAndValue is{d=delhi, b=britain, c=canada, a=america}
d>>DOG-delhi
b>>BAT-britain
c>>CAT-canada
a>>APPLE-america
[d>>DOG-delhi, b>>BAT-britain, c>>CAT-canada, a>>APPLE-america]
returned list of keys & values is[d>>DOG-delhi, b>>BAT-britain, c>>CAT-canada, a>>APPLE-america]
*/