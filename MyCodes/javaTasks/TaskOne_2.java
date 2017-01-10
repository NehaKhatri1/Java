import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TaskOne_2 {
        public static void main(String[] args){

                //task one:2: Create a list of of strings like "apple " , "bat " , "cat " , "dog "  . Use for loop to iterate and print it . .

                List<String> listOfString=new ArrayList<String>();
                listOfString.add("apple");
                listOfString.add("bat");
                listOfString.add("cat");
                listOfString.add("dog");


                System.out.println("list is"+listOfString);



                //         task one:7: Using for loop and using the list used in task one : subtask 2 , iterate array and populate the five objects of task one subtask 5.   Those objects should be finally inside a list of animal objects . 
                System.out.println("printing arraylist as object");
                for(int i=0;i<listOfString.size();i++){
                        Animal animal2=new Animal();
                        animal2.setName(listOfString.get(i));   

                        System.out.println(animal2.getName());
                }

                // task one:8: Create a map with an entry like {a, object of animal class} without for loop.

                Map<String, List<String>> map2=new HashMap<String, List<String>>();
                map2.put("a",listOfString);

                System.out.println("map "+map2);



                //task one:9: Create a map with 5 entries using for loop for subtask 8.
                for(int i=1;i<=listOfString.size();i++)
                {
                        String str=String.valueOf(i);
                        map2.put(str,listOfString);
                }
                System.out.println("map task 9"+map2);

        }

}

/*list is[apple, bat, cat, dog]
printing arraylist as object
apple
bat
cat
dog
map {a=[apple, bat, cat, dog]}
map task 9{3=[apple, bat, cat, dog], 2=[apple, bat, cat, dog], 1=[apple, bat, cat, dog], 4=[apple, bat, cat, dog], a=[apple, bat, cat, dog]}
*/