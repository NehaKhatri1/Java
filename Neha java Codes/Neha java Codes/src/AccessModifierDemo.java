
class Book{	
		protected int pages;
		private String author;	
		protected void setPages(int pages){
			this.pages=pages;
		}
		
		protected int getPages(){
			return this.pages;
		}	 
		Book(int pages){
			this.pages=pages;
		}
		Book(){
		}	
	}
	public class AccessModifierDemo {
		public static void main(String[] args) {
			Book book = new Book();
			//System.out.println(book.pages);
			book.pages=60;
			book.setPages(100);
			System.out.println(book.getPages());
			
			Book bookParameterized =new Book(100);
			System.out.println(bookParameterized.getPages());		
		}

	}
	
	
	
	

