
package com.thb.TaskFifth;

import java.util.Iterator;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TaskFifth {

        /*here is a csv . 
        it has paths like : 
        c:/test/test1.txt
        c:/test/test2.txt
        c:/test/test3.txt
        First create those files in your hard disk with some contents . 
        Then read this csv having the file addresses , read the csv , then read the contents of the file mentioned in the csv . Concatenate them using delimiter "#####################################" and print it . 
        then output the same to hard disc in file name concatenatedFile.txt . 
         */
        public static void main(String[] args)throws IOException,FileNotFoundException{
                List<String> list=new ArrayList<String>();
                List<String> delimitedList=new ArrayList<String>();

                try{
                        File file = new File("C:\\Users\\Desktop\\properties.txt");
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                        String line = "";
                        String str = "";
                        while((line=bufferedReader.readLine())!=null){
                                System.out.println("line of properties.txt is : "+line);

                                File subfiles = new File(line);
                                BufferedReader bufferedReaderForSubFiles = new BufferedReader(new FileReader(subfiles));
                                String subFilesLine = "";
                                String subfilesstr = "";
                                while((subFilesLine=bufferedReaderForSubFiles.readLine())!=null){
                                        System.out.println("lines of subfiles are : "+subFilesLine);
                                        String[] SplittedsubFilesLine=subFilesLine.split(",");

                                        list.add(SplittedsubFilesLine[0]);

                                }
                        }
                        System.out.println("list is"+list);
                        Iterator<String> listitr=list.listIterator();
                        while(listitr.hasNext()){
                                String variable =listitr.next();
                                String alteredvariable=variable+"##############";
                                System.out.println(alteredvariable);
                                delimitedList.add(alteredvariable);
                        }
                        System.out.println("delimitedList is "+delimitedList);





                }catch (FileNotFoundException e) {
                        // TODO: handle exception
                        System.out.println("File not found.");
                }
        }


}

/*
------output
line of properties.txt is : C:\Users\Desktop\company.txt
lines of subfiles are : AMEX,CO,25000
lines of subfiles are : WIPRO,CL,20000
lines of subfiles are : TCS,NC,12000
lines of subfiles are : CTS,NL,10000
line of properties.txt is : C:\Users\Desktop\buysell.txt
lines of subfiles are : AMEX,CO,buy
lines of subfiles are : WIPRO,CL,sell
lines of subfiles are : TCS,NC,buy
lines of subfiles are : CTS,NL,sell
line of properties.txt is : C:\Users\Desktop\trade.txt
lines of subfiles are : buy,1
lines of subfiles are : sell,2
list is[AMEX, WIPRO, TCS, CTS, AMEX, WIPRO, TCS, CTS, buy, sell]
AMEX##############
WIPRO##############
TCS##############
CTS##############
AMEX##############
WIPRO##############
TCS##############
CTS##############
buy##############
sell##############
delimitedList is [AMEX##############, WIPRO##############, TCS##############, CTS##############, AMEX##############, WIPRO##############, TCS##############, CTS##############, buy##############, sell##############]
*/
