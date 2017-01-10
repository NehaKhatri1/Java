package com.thb.Dog.GenericHashmap1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.thb.Dog.GenericHashmap.DogModel;

public class DogMasterModelService {

        public static void main(String[] args){

                String[] masterNamesString={"Aarti","Pooja","Neha","Khatri","Aluwalia"};
                List<String> listOfString=new ArrayList<String>();
                Map<DogModel,String> mapOfListOfNamesAndStringOfMasterNames=new HashMap<DogModel, String>();


                for (int i = 0; i < masterNamesString.length; i++) {

                        listOfString.add(masterNamesString[i]);
                }
                System.out.println("listofstring is"+listOfString);


                //Have another hashmap having key as dog name and value as mater's name.

                //from previous code 
                String[] StringNames={"shelly","joulie","sheru","tuffy","tonu"};
                List<DogModel> listOfDogNames=new ArrayList<DogModel>();

                //System.out.println(" Name of Dogs are ");
                //System.out.println("");


                for (int i = 0; i <StringNames.length; i++) {
                        DogModel dogmodel=new DogModel();
                        dogmodel.setDogname(StringNames[i]);
                        //        System.out.println(dogmodel.getDogname());
                        listOfDogNames.add(dogmodel);

                }
                System.out.println("");
                System.out.println("listOfDogNames");
                System.out.println("");
                for (int j = 0; j < listOfDogNames.size(); j++) {
                        System.out.println(listOfDogNames.get(j).getDogname());
                }

                for (int i = 0; i <StringNames.length; i++) {


                        mapOfListOfNamesAndStringOfMasterNames.put(listOfDogNames.get(i),masterNamesString[i]);
                }
                System.out.println("mapOfListOfNamesAndStringOfMasterNames"+mapOfListOfNamesAndStringOfMasterNames);
        }
}

/* Output 
listofstring is[Aarti, Pooja, Neha, Khatri, Aluwalia]

listOfDogNames

shelly
joulie
sheru
tuffy
tonu
mapOfListOfNamesAndStringOfMasterNames{joulie=Pooja, shelly=Aarti, sheru=Neha, tonu=Aluwalia, tuffy=Khatri}
*/

