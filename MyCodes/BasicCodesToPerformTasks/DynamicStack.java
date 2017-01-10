public class DynamicStack implements Stack {
        int x=5;
        
        public void push(){
                System.out.println("HI i am method push inside dynamic Stack."+x);
        }
@Override
 public void pop(){
        System.out.println("HELLO i am method pop inside dynamic Stack. "+x); 
 }
}