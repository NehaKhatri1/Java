Task_Seventh 
package com.thb.TaskFifth;

import java.util.List;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.hadoop.mapred.SpillRecord;

public class TaskSeventh {

        //Craete a hashmap like<FileName,ListOfSecondPosition> for all 3 files. 

        public static void main(String[] args)throws IOException,FileNotFoundException{
                List<String> list=new ArrayList<String>();
                List<String> delimitedList=new ArrayList<String>();
                Map<String,List<String>> mapOfFileNameAndSecondPostion=new HashMap<String,List<String>>();

                try{
                        File file = new File("C:\\Users\\nsare1\\Desktop\\properties.txt");
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                        String line = "";
                        String str = "";
                        while((line=bufferedReader.readLine())!=null){
                                System.out.println(line);
                                //String[] splittedPath=line.split(":");
                                String[] spiltedBySlash=line.split("\\\\");
                                String fileName=spiltedBySlash[4];
                                System.out.println("spilttedPath "+fileName);
                                mapOfFileNameAndSecondPostion.put(fileName,list );
                                System.out.println("hi pooja"+mapOfFileNameAndSecondPostion);


                                File subfiles = new File(line);
                                BufferedReader bufferedReaderForSubFiles = new BufferedReader(new FileReader(subfiles));
                                String subFilesLine = "";
                                String subfilesstr = "";
                                while((subFilesLine=bufferedReaderForSubFiles.readLine())!=null){
                                        System.out.println("lines of subfiles are : "+subFilesLine);
                                        String[] splittedsubFilesLine=subFilesLine.split(",");
                                        String columnSecond=splittedsubFilesLine[1];
                                        list.add(columnSecond);
                                        mapOfFileNameAndSecondPostion.put(fileName,list );
                                        System.out.println("hi sweety"+list);
                                        System.out.println("hi neha"+mapOfFileNameAndSecondPostion);
                                }
                        }
                        System.out.println("list is"+list);
                        //mapOfFileNameAndSecondPostion.put(key, value);


                }catch (FileNotFoundException e) {
                        // TODO: handle exception
                        System.out.println("File not found.");
                }
        }


}

/* Output
C:\Users\Desktop\company.txt
spilttedPath company.txt
hiiiii{company.txt=[]}
lines of subfiles are : AMEX,CO,25000
list is[CO]
mapOfFileNameAndSecondPostion{company.txt=[CO]}
lines of subfiles are : WIPRO,CL,20000
list is[CO, CL]
mapOfFileNameAndSecondPostion{company.txt=[CO, CL]}
lines of subfiles are : TCS,NC,12000
list is[CO, CL, NC]
mapOfFileNameAndSecondPostion{company.txt=[CO, CL, NC]}
lines of subfiles are : CTS,NL,10000
list is[CO, CL, NC, NL]
mapOfFileNameAndSecondPostion{company.txt=[CO, CL, NC, NL]}
C:\Users\Desktop\buysell.txt
spilttedPath buysell.txt
hiiiii{buysell.txt=[CO, CL, NC, NL], company.txt=[CO, CL, NC, NL]}
lines of subfiles are : AMEX,CO,buy
list is[CO, CL, NC, NL, CO]
mapOfFileNameAndSecondPostion{buysell.txt=[CO, CL, NC, NL, CO], company.txt=[CO, CL, NC, NL, CO]}
lines of subfiles are : WIPRO,CL,sell
list is[CO, CL, NC, NL, CO, CL]
mapOfFileNameAndSecondPostion{buysell.txt=[CO, CL, NC, NL, CO, CL], company.txt=[CO, CL, NC, NL, CO, CL]}
lines of subfiles are : TCS,NC,buy
list is[CO, CL, NC, NL, CO, CL, NC]
mapOfFileNameAndSecondPostion{buysell.txt=[CO, CL, NC, NL, CO, CL, NC], company.txt=[CO, CL, NC, NL, CO, CL, NC]}
lines of subfiles are : CTS,NL,sell
list is[CO, CL, NC, NL, CO, CL, NC, NL]
mapOfFileNameAndSecondPostion{buysell.txt=[CO, CL, NC, NL, CO, CL, NC, NL], company.txt=[CO, CL, NC, NL, CO, CL, NC, NL]}
C:\Users\Desktop\trade.txt
spilttedPath trade.txt
hiiiii{buysell.txt=[CO, CL, NC, NL, CO, CL, NC, NL], trade.txt=[CO, CL, NC, NL, CO, CL, NC, NL], company.txt=[CO, CL, NC, NL, CO, CL, NC, NL]}
lines of subfiles are : buy,1
list is[CO, CL, NC, NL, CO, CL, NC, NL, 1]
mapOfFileNameAndSecondPostion{buysell.txt=[CO, CL, NC, NL, CO, CL, NC, NL, 1], trade.txt=[CO, CL, NC, NL, CO, CL, NC, NL, 1], company.txt=[CO, CL, NC, NL, CO, CL, NC, NL, 1]}
lines of subfiles are : sell,2
list is[CO, CL, NC, NL, CO, CL, NC, NL, 1, 2]
mapOfFileNameAndSecondPostion{buysell.txt=[CO, CL, NC, NL, CO, CL, NC, NL, 1, 2], trade.txt=[CO, CL, NC, NL, CO, CL, NC, NL, 1, 2], company.txt=[CO, CL, NC, NL, CO, CL, NC, NL, 1, 2]}
list is[CO, CL, NC, NL, CO, CL, NC, NL, 1, 2]

*/