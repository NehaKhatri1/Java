
package com.thb.ListOfObjects;

//import Animal;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class TaskONE_8 {

        public static void main(String[] args){        

                //task one:8: Create a map with an entry like {a, object of animal class} without for loop.  active

                Map<String,Animal> map1 = new HashMap<String, Animal>();
                map1.put("a",null);
                map1.put("b",null);
                map1.put("c",null);
                map1.put("d",null);

                System.out.println("map "+map1);




                // lets craete objects of class animal 

                Animal animal=new Animal();

                // lets say list of animal names are , donkey,monkey,cat,dog
                List<String> list=new ArrayList<String>();
                list.add("donkey");
                list.add("monkey");
                list.add("cat");
                list.add("dog");

                System.out.println("list of animals  is"+list);
                List<Animal> listoftypeanimalobject=new ArrayList<Animal>();

                //lets convert this list of animals(of type String) into objects of class Animal.
                for (int j = 0; j < list.size(); j++) {

                        animal.setName(list.get(j));
                        listoftypeanimalobject.add(animal);
                        System.out.println( listoftypeanimalobject.get(j).getName());

                }
        }
}
/*        //lets add objects into listofanimalobjects one by one now.

                //        List<Animal> listoftypeanimalobject=new ArrayList<Animal>();

                /*        for (int i = 0; i < list.size(); i++) {
                        listoftypeanimalobject.add(animal);
                }
 */
/*                for (int i = 0; i < listoftypeanimalobject.size(); i++) {
                        //lets print objects of listanimal .
                        System.out.println( listoftypeanimalobject.get(i).getName());
                }
 */

/* output
map {d=null, b=null, c=null, a=null}
list of animals  is[donkey, monkey, cat, dog]
donkey
monkey
cat
dog
*/

