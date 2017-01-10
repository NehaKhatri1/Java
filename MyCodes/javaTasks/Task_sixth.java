

package com.thb.TaskFifth;

import java.util.List;

import java.util.Iterator;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class TaskSixth {



        // 4.  Add "$$" delimiter between column first & second of all 3 files in the existing codebase(TaskFifth) & print in a list. done


        public static void main(String[] args)throws IOException,FileNotFoundException{
                List<String> list=new ArrayList<String>();
                List<String> delimitedList=new ArrayList<String>();

                try{
                        File file = new File("C:\\Users\\nsare1\\Desktop\\properties.txt");
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
                                        String concatenatedString=SplittedsubFilesLine[0]+"_$$_"+SplittedsubFilesLine[1];
                                        list.add(concatenatedString);

                                }
                        }
                        System.out.println("list is"+list);



                }catch (FileNotFoundException e) {
                        // TODO: handle exception
                        System.out.println("File not found.");
                }
        }


}


/*  Output
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
list is[AMEX_

_2
]
*/