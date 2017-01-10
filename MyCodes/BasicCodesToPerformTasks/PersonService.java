public class PersonService {

        public static void main(String [] args){
                for(int i=1;i<=1000;i++){
                        String personName=String.valueOf(i);
                        Person person =new Person(personName,i);

                        //Person person =new Person(i);
                        System.out.println("Name of person "+i +" is "+person.getName());
                        System.out.println("age of person "+i +" is "+person.getAge());
                        System.out.println(" ");

                }
        }
}
/*
Sample Output
Name of person 1 is 1
age of person 1 is 1
 
Name of person 2 is 2
age of person 2 is 2
 
Name of person 3 is 3
age of person 3 is 3
 
Name of person 4 is 4
age of person 4 is 4
 
Name of person 5 is 5
age of person 5 is 5
 
Name of person 6 is 6
age of person 6 is 6
*/

