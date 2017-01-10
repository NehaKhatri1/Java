package com.thb.version.two.Library;

import java.util.List;

public class Book {

        String nameOfBook;
        String authorName;
        List<Page> listOfPages;
        
        
        
        public String getNameOfBook() {
                return nameOfBook;
        }
        public void setNameOfBook(String nameOfBook) {
                this.nameOfBook = nameOfBook;
        }
        public String getAuthorName() {
                return authorName;
        }
        public void setAuthorName(String authorName) {
                this.authorName = authorName;
        }
        public List<Page> getListOfPages() {
                return listOfPages;
        }
        public void setListOfPages(List<Page> listOfPages) {
                this.listOfPages = listOfPages;
        }

        }
