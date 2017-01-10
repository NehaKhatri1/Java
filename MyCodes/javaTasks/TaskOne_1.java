
package com.thb.ListObjectHasMap;

public class TaskONE_1 {
        public static void main(String [] args){
                //        task one:1 : Create an array of strings like "apple " , "bat " , "cat " , "dog "  . Use for loop to iterate and print it 
                String[] arrayOfString={"apple","bat","cat","dog"};
                for(int i=0;i<arrayOfString.length;i++)
                {
                        System.out.println("printing elements one by one of StringArray "+arrayOfString[i]);
                        System.out.println("");
                }



                //task one:6: Using for loop and using the array used in task one : subtask 1 , iterate array and populate the five objects of task one subtask 5.
                System.out.println("printing arrayofStrings as object");
                for(int i=0;i<arrayOfString.length;i++){
                        Animal animal=new Animal();
                        //        animal2[i].;
                        //arrayOfString[i].contains(animal2.getName());
                        //System.out.println("arrayOfString[i] is "+arrayOfString[i]);
                        animal.setName(arrayOfString[i]);

                        System.out.println(animal.getName());
                }



        }

}




/* public static void main(String[] args){


         }*/

/*output
printing elements one by one of StringArray apple

printing elements one by one of StringArray bat

printing elements one by one of StringArray cat

printing elements one by one of StringArray dog

printing arrayofStrings as object
apple
bat
cat
dog
*/