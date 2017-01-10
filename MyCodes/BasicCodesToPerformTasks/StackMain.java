public class StackMain {
        public static void main(String [] args)
        {
                Stack referofstack;

                referofstack =new DynamicStack();
                referofstack.pop();
                referofstack.push();


                referofstack = new StaticStack();
                referofstack.pop();
                referofstack.push();


                // unrelated code . 
                /*        Stack[] referofstack = new Stack[2];

                referofstack[0]=new DynamicStack();
                referofstack[1]=new StaticStack();

                //calling of methods 
                referofstack[0].pop();
                referofstack[0].push();

                referofstack[1].pop();
                referofstack[1].push();
                 */
        }

}


/* Output
HELLO i am method pop inside dynamic Stack. 5
HI i am method push inside dynamic Stack.5
Static Stack class's pop method.1000
Static Stack class's push method.1000
*/

