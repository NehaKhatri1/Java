import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OneTask {
        public static void main(String[] args){
                // Task 1 : Create a list of string containing strings - "apple", "bat" , "cat" , "dog" .
                String[] stringValues = {"apple","bat","cat","dog"};

                List<String> listOfStringValues = new ArrayList<String>();
                for(int i=0;i<stringValues.length;i++){
                        listOfStringValues.add(stringValues[i]);
                }

                // print the list now 
                for(int i=0;i<listOfStringValues.size();i++){
                        System.out.println("list contents are : "+listOfStringValues.get(i));
                }

                // Task 2 : Then Create a map with keys "a" , "b" , "c" , "d " . 

                Map<String,Animal> mapOfAlphabeticKeysToAnimalObjects = new HashMap<String, Animal>();
                mapOfAlphabeticKeysToAnimalObjects.put("a", null);
                mapOfAlphabeticKeysToAnimalObjects.put("b", null);
                mapOfAlphabeticKeysToAnimalObjects.put("c", null);
                mapOfAlphabeticKeysToAnimalObjects.put("d", null);
                // its completely fine to have valuees to be null in a map , what map needs is distinct non-null keys . 
                System.out.println("The mapOfAlphabeticKeysToAnimalObjects is :  "+mapOfAlphabeticKeysToAnimalObjects);

                //  task 3 : Then have a final hashmap whose key is like "a" , "b" .... and corresponding values are objects of Animal class containing the names in the string . 
                // breaking down above statement . 
                // task 3-1 : first create objects and populate it with string values;

                List<Animal> listOfAnimals = new ArrayList<Animal>();
                // populating list of animials with animal objects having corresponding names  . 
                for(int i=0;i<listOfStringValues.size();i++){
                        Animal animal = new Animal();
                        animal.setName(listOfStringValues.get(i));
                        //System.out.println(animal.setName(listOfStringValues.get(i)));

                        listOfAnimals.add(animal);
                        //System.out.println("listOfAnimals"+listOfAnimals);
                }
                // printing to check populated list of animals with name values 
                for(int i =0;i<listOfAnimals.size();i++){
                        System.out.println("animals with names are "+listOfAnimals.get(i).getName());
                }
                //task 3-2 : now to populate the hashmap with keys already populated with values(name ) from listOfAnimals

                Set<String> keySetOfMapOfAlphabeticKeysToAnimalObjects = mapOfAlphabeticKeysToAnimalObjects.keySet();



                for(int i =0;i<listOfAnimals.size();i++){
                        Animal animal = listOfAnimals.get(i);
                        String characterToBeMatched = animal.getName().substring(0,1);
                        System.out.println("characterToBeMatched is ; "+characterToBeMatched);
                        Iterator<String> keySetIterator = keySetOfMapOfAlphabeticKeysToAnimalObjects.iterator();
                        while(keySetIterator.hasNext()){
                                String key = keySetIterator.next();
                                System.out.println("key is :" +key);
                                if(characterToBeMatched.equalsIgnoreCase(key)){
                                        mapOfAlphabeticKeysToAnimalObjects.put(key,animal);
                                        System.out.println("********map key is : "+key);
                                        System.out.println("********map value object is : "+animal);
                                        System.out.println("********map value object's name is : "+animal.getName());
                                }
                        }
                }





        }// end of psvm



}
/*
list contents are : apple
list contents are : bat
list contents are : cat
list contents are : dog
The mapOfAlphabeticKeysToAnimalObjects is :  {d=null, b=null, c=null, a=null}
animals with names are apple
animals with names are bat
animals with names are cat
animals with names are dog
characterToBeMatched is ; a
key is :d
key is :b
key is :c
key is :a
********map key is : a
********map value object is : Animal@6d4b473
********map value object's name is : apple
characterToBeMatched is ; b
key is :d
key is :b
********map key is : b
********map value object is : Animal@7692ed85
********map value object's name is : bat
key is :c
key is :a
characterToBeMatched is ; c
key is :d
key is :b
key is :c
********map key is : c
********map value object is : Animal@2827f394
********map value object's name is : cat
key is :a
characterToBeMatched is ; d
key is :d
********map key is : d
********map value object is : Animal@56e88e24
********map value object's name is : dog
key is :b
key is :c
key is :a
*/
