CompareTo method Implementation 
package com.thb.Dog.GenericHashmap;

public class DogModel {

        String Dogname;

        public String getDogname() {
                return Dogname;
        }

        public void setDogname(String dogname) {
                Dogname = dogname;
        }

        @Override
        public String toString() {
                //System.out.println("tostring method ");
                return Dogname; //"DogModel [Dogname=" + Dogname + "]";
        }
        
}

/*
 Name of Dogs are 

listOfDogNames

shelly
joulie
sheru
tuffy
tonu

returnedString from stringto method is 

shelly
joulie
sheru
tuffy
tonu

mapOfStringKeyAndValueDogModel is{tuffy=tuffy, shelly=shelly, tonu=tonu, joulie=joulie, sheru=sheru}
*/

