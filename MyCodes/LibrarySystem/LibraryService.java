package com.thb.version.two.Library;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

        public static void main(String[] args){
                
                Page firstPage = new Page();
                firstPage.setFooterOfPage("thb.com");
                firstPage.setPageNumber(1);
                
                Page secondPage = new Page();
                secondPage.setFooterOfPage("thb.com");
                secondPage.setPageNumber(2);
                
                List<Page> listOfPages = new ArrayList<Page>();
                listOfPages.add(firstPage);
                listOfPages.add(secondPage);
                
        
                
                Book firstBook = new Book();
                firstBook.setAuthorName("Neha");
                firstBook.setListOfPages(listOfPages);
                firstBook.setNameOfBook("java one");
                
                Book secondBook = new Book();
                firstBook.setAuthorName("Anu");
                firstBook.setListOfPages(listOfPages);
                firstBook.setNameOfBook("java two");
                
                List<Book> listOfBooks = new ArrayList<Book>();
                listOfBooks.add(firstBook);
                listOfBooks.add(secondBook);
                
                
                Shelf firstShelf = new Shelf();
                firstShelf.setListOfBooks(listOfBooks);
                firstShelf.setNoOfshelves(1);
                
                List<Shelf> listOfShelves = new ArrayList<Shelf>();
                listOfShelves.add(firstShelf);
                
                Library libraryModified = new Library();
                libraryModified.setCategary("technology");
                libraryModified.setListOfShelves(listOfShelves);
                
                // fetching library
                System.out.println(libraryModified.getCategary());
                
                // fetching first shelf from list of shelves
                System.out.println(libraryModified.getListOfShelves().get(0));
                
                // fetching id of first shelf from list of shelves
                System.out.println(libraryModified.getListOfShelves().get(0).getNoOfshelves());
                
                // fetching first book's author name from list of books from first shelf
                System.out.println(libraryModified.getListOfShelves().get(0).getListOfBooks().get(0).getAuthorName());
                
                // fetching the footer of the first page from first book from first shelf of the library 
                System.out.println(libraryModified.getListOfShelves().get(0).getListOfBooks().get(0).getListOfPages().get(0).getFooterOfPage());
                
                System.out.println("hi neha "+libraryModified.getListOfShelves().get(0).getListOfBooks().get(0).getListOfPages().get(0).getFooterOfPage());
                
                        }
}

/*  output ------ technology
com.thb.version.two.Library.Shelf@790f2f3c
1
Anu
thb.com
hi neha thb.com

*/
