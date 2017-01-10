
package com.thb.ListObjectHasMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class TaskOne_2 {
        public static void main(String[] args){

                //task one:2: Create a list of of strings like "apple " , "bat " , "cat " , "dog "  . Use for loop to iterate and print it . .

                List<String> listOfString=new ArrayList<String>();
                listOfString.add("apple");
                listOfString.add("bat");
                listOfString.add("cat");
                listOfString.add("dog");


                System.out.println("list is"+listOfString);
                for(int i=0;i<listOfString.size();i++){
                        System.out.println(        listOfString.get(i));
                }

                //         task one:7: Using for loop and using the list used in task one : subtask 2 , iterate array and populate the five objects of task one subtask 5.   Those objects should be finally inside a list of animal objects . 
                System.out.println("printing arraylist as object");
                List<Animal> listOfAnimal= new ArrayList<Animal>();
                {
                        for(int i=0;i<listOfString.size();i++){
                                Animal animal=new Animal();
                                animal.setName(listOfString.get(i));   
                                listOfAnimal.add(animal);
                                System.out.println("name "+animal.getName());
                        }
                }
        }

        //System.out.println("animallist"+listOfAnimal.get(index));
        //  return listOfAnimal;
        //        }
        // task one:8: Create a map with an entry like {a, object of animal class} without for loop.

        //Set<String> keyset=new HashSet{"a","b","c","d"};
        Map<String,String> map=new HashMap<String,String>();
        //map.put("a",null);


        //Iterator<String>itr=keyset.

        //       key;
}



//task one:9: Create a map with 5 entries using for loop for subtask 8.
/*        for(int i=1;i<=listOfString.size();i++)
                {
                        String str=String.valueOf(i);
                        map2.put(str,listOfString);
                }
                System.out.println("map task 9"+map2);

        }*/

/*output
list is[apple, bat, cat, dog]
apple
bat
cat
dog
printing arraylist as object
name apple
name bat
name cat
name dog
*/-