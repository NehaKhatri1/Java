public class NumericTest {
        public static void main(String[] args){
                String numeric = "neha";
                Boolean bool = (isNumeric(numeric));
                if(bool==false){
                 System.out.println("non numeric number");
                }
                else{
                        System.out.println("numeric number");
                }
        }
        
        public static Boolean isNumeric(String str)  
        {  
                try  
                {  
                        double d = Double.parseDouble(str);  
                }  
                catch(NumberFormatException nfe)  
                { 
//                        nfe.printStackTrace();
                        return false;  
                }  
                return true;  
        }
}

/* output
non numeric number
*/
