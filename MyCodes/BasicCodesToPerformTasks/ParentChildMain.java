public class ParentChildMain {

        public static void main(String[] agrs){

                //edited code 3 . Example of full dynamic polymorphism.
                Parent refOfParent;
                refOfParent=new Parent(); // form(parent) one of object.
                refOfParent.eat();
                refOfParent.responsible();



                refOfParent=new Child(); // form(child) two of object .
                refOfParent.eat();
                refOfParent.responsible();
                //        refOfParent.irresponsible(); // Will give compile time error .



                /*        
                //edited code 2 which is implementing half dynamic polymorphism.

                Parent refofparent=new Child();
                System.out.println("child's father name is "+refofparent.fathername);
                System.out.println("child's mother name is "+refofparent.mothername);

        refofparent.eat();
        refofparent.responsible();

     //   refofparent.irresponsible();  // will give compile time error as irresponsible method is not defined in parent class.
        }}
                 */


                // edited code 1. code snippet for Single inheritance 
                /*        Child child=new Child();
                System.out.println("child's father name is "+child.fathername);
                System.out.println(" child's mother name is "+child.mothername);

                child.eat();
                child.irresponsible();
                child.responsible();
                 */

        }
}

/*Output
parents eat.
parents r always responsible for their kids. 
kids eat.
parents r always responsible for their kids. 
*/

