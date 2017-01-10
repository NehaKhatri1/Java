import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ListHashMap {
        public static void main(String[] args ){

                // scenario 1.
                List<String> list= new ArrayList<String>();
                list.add("apple");
                list.add("bat");
                list.add("cat");

                System.out.println("list is "+list);

                // scenario 2 
                Map<String,String> map=new HashMap<String,String>();
                map.put("a","apple");
                map.put("b","bat");
                map.put("c","cat");

                System.out.println("map is "+map);


                // scenario 3

                //Map<Integer,Object> map1= new HashMap<Integer,Object>();
                //Map<Integer,Either<String,List<String>>> map1=new HashMap<Integer,Either<String,List<String>>>();
                Map<Integer,List<String>> map4=new HashMap<Integer,List<String>>();
                //        String Convertedlist =String.valueOf(list);


                map4.put(1,list);
                System.out.println("Map1 is "+map4);


                /*        you till then make a list of string - "apple" , "bat" ,"cat " . 
        then make a hashmap of - a,apple : b,bat : c,cat 
        then make a hashmap of 1, firstList where first list contains apple , bat , cat 
                 */
        }

}

/*list is [apple, bat, cat]
map is {b=bat, c=cat, a=apple}
Map1 is {1=[apple, bat, cat]}

*/