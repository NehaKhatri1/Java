
public class AccessModifierDemo {
        public static void main(String[] args) {
                Book book = new Book();
                //System.out.println(book.pages);

                book.setPages(100);
                System.out.println("hi "+book.getPages());

                Book bookParameterized =new Book(100);
                System.out.println("Hello "+bookParameterized.getPages());                
        }

}

/*Output
hi 100
Hello 100
*/
