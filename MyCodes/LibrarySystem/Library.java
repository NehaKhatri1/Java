package com.thb.version.two.Library;

import java.util.List;

import org.apache.hadoop.util.Shell;

public class Library {

        /*libraryclass
        1. category,subcategory,

        shelves class
        1.listof booksina shelf,noofshelf
        Books class
        1.nameofbook,author,
        page class
        int noOfPages;
        String pagefooter;
*/

        String categary;  //like science 
        String subcategory;  //like biology/chemistry/physics.  
        List<Shelf> listOfShelves;
        
        
        public String getCategary() {
                return categary;
        }
        public void setCategary(String categary) {
                this.categary = categary;
        }
        public String getSubcategory() {
                return subcategory;
        }
        public void setSubcategory(String subcategory) {
                this.subcategory = subcategory;
        }
        public List<Shelf> getListOfShelves() {
                return listOfShelves;
        }
        public void setListOfShelves(List<Shelf> listOfShelves) {
                this.listOfShelves = listOfShelves;
        }
        

}
