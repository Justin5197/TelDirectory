package labSix;

//Author: Justin Little
//Date: March 27, 2016

public class TelDirectory implements Comparable <TelDirectory> { // Creating a class that implements the Comparable class of type TelDirectory
    private String name; //Declares a String called name to store people's names in the directory
    private String number; // Declares a String to hold the phone number for the directory

    public TelDirectory(String name, String number) { //Creates the object "TelDirectory" which contains the name and number
        this.name = name; //When a new object is created, it will assign the specified name
        this.number = number; // & number to the "name" and "number" variables
    }

    public String getName() {  //getter method for name variable
        return name;
    }

    public String getNumber() { //getter method for number variable
        return number;
    }

    public int compareTo(TelDirectory other) { //Overwrites the "compareTo" method in the "Comparable" class to order the names in alphabetical order first, then order the numbers
        if (name != other.getName()) {              //returns a 1 if "name" comes after the next name "other" you are comparing to
            return name.compareTo(other.getName());  //returns a -1 if "name" comes before the next name "other" you are comparing to
        } //if the two names are the same, it will continue to the next if conditional

        if(number != other.getNumber()) { //returns a 1 if the first number in the phone number string is greater than the one you're comparing to
            return number.compareTo(other.getNumber()); //returns a -1 if the first number in the phone number strung is less than the one you're comparing to

        } else {
            return 0; //if both the name and number are the same, the function will return a 0.
        }
    }

    public String toString() { //Overwrites the toString method for ArrayLists.
        return name + ": "+ number; //This will format the names and numbers beside eachother as a telephone directory would
    }

}
