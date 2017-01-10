public class StaticStack implements Stack {

int q=1000;
        
        public void push(){
                System.out.println("Static Stack class's push method."+q);
        }
 @Override
 public void pop(){
        System.out.println("Static Stack class's pop method."+q); 
 }

}