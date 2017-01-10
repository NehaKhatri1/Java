import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;





public class SetKeyExample {
        public static void main(String [] args){
                Map<String,String> map1=new HashMap<String,String>();
                Set<String> set1=new HashSet<String>();
                map1.put("a","apple");
                map1.put("b","bnana");
                map1.put("c","cat");


                Integer gap=(map1.size()-(map1.size()-1));
                System.out.println("hi "+map1.get(gap).valueOf("a"));
                System.out.println("gap "+gap);
                System.out.println("map1");
                set1 =map1.keySet();
                System.out.println("keyset "+set1);

                for(String key : map1.keySet()){
                        // System.out.println(   map1.get(key).equals(map1.get(key)));
                        //    if(key)
                        System.out.println(key);


                        /* Set<String> keys = hm.keySet();
                  for(String key: keys){
                      System.out.println(key);

              }}*/



                }
        }

}

/* OUTPUT

hi a
gap 1
map1
keyset [b, c, a]
b
c
a
*/

