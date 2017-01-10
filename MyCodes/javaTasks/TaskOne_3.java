package com.thb.ListObjectHasMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class TaskOne_3 {

        //        task one:3: Create a map having key-value like {a,apple},{b,bat},{c,cat},{d,dog} and print that hashmap object
        public static void main(String[] args){

                Map<String,String> MapOfStrings=new HashMap<String,String>();
                MapOfStrings.put("a","apple"); 
                MapOfStrings.put("b","bat"); 
                MapOfStrings.put("c","cat"); 
                MapOfStrings.put("d","dog"); 

                System.out.println("map is"+MapOfStrings);

                //                 task one:4: In the above map print the keyset of map in task one -> sub task 3 

                System.out.println("keyset"+ MapOfStrings.keySet());

                //        task one:4: In the subtask three , search for key "b" and then print found , use loop/iterator for this search
                Set<String> setOfKeys=new HashSet<String>();
                setOfKeys= MapOfStrings.keySet();
                System.out.println("setOfKeys"+setOfKeys);
                Iterator<String> itr=setOfKeys.iterator();
                while(itr.hasNext()){
                        String key=itr.next();
                        System.out.println("key "+key);

                        if(key.matches("b")){
                                System.out.println("key matches with b ");
                        }

                }


                /*if(MapOfStrings.containsKey("b")){
                        System.out.println("yes ..");

                        System.out.println("found b in map");
                        


//                System.out.println("found b in map");
                        }*/


        }

}

/*output
map is{d=dog, b=bat, c=cat, a=apple}
keyset[d, b, c, a]
setOfKeys[d, b, c, a]
key d
key b
key matches with b 
key c
key a
*/
