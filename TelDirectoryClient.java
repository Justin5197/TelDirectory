package labSix;

//Author: Justin Little
//Date: March 27, 2016

import java.util.*;

public class TelDirectoryClient {

    public static void main(String [] args) {
        ArrayList <TelDirectory> list1 = new ArrayList <TelDirectory>(); //Creates a new ArrayList of type TelDirectory called list1

        TelDirectory o1 = new TelDirectory("Justin", "478-123-1233"); //Creates object o1 using the name and number as parameters
        list1.add(o1);  //Adds o1 to the list

        TelDirectory o2 = new TelDirectory("Bob", "478-124-1244");
        list1.add(o2);

        TelDirectory o3 = new TelDirectory("Gina", "478-125-1255");
        list1.add(o3);

        TelDirectory o4 = new TelDirectory("Billy", "478-126-1266");
        list1.add(o4);

        TelDirectory o5 = new TelDirectory("Japhet", "478-127-1277");
        list1.add(o5);

        TelDirectory o6 = new TelDirectory("Neil", "478-128-1288");
        list1.add(o6);

        TelDirectory o7 = new TelDirectory("Annette", "478-129-1299");
        list1.add(o7);

        TelDirectory o8 = new TelDirectory("Bethel Lou", "478-122-1222");
        list1.add(o8);

        TelDirectory o9 = new TelDirectory("Cora", "478-121-1211");
        list1.add(o9);

        TelDirectory o10 = new TelDirectory("Amani", "478-781-6133");
        list1.add(o10);

        System.out.println(list1); //Prints the list before sorting
        Collections.sort(list1); // Sorts list in alphabetical order using "Collections.sort"
        System.out.println(list1); //Prints the list after sorting


    }
}
