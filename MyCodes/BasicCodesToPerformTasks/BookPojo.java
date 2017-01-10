class BookPojo{        
        private int pages;
        private String author;        
        public void setPages(int pages){
                this.pages=pages;
        }

        public int getPages(){
                return this.pages;
        }         
        Book(int pages){
                this.pages=pages;
        }
        Book(){
        }        
}