package ArrayList;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        
        //Creating an ArrayList Intger
        ArrayList<String> list = new ArrayList<>();

        //1) Size() - Returns the number of elements in the list.
        System.out.println("Size of the list: " + list.size());

        //2) Add() - Adds an element to the list.
        list.add("Dudh");
        list.add("Ghee");
        list.add("Pav Bhaji Masala");
        list.add("Paav");
        list.add("Thums Up");
        list.add("Dhaniya"); //Free ka dhaniya
        list.add("Mirchi"); //Free ka mirchi

        //3) add(int index, E element) - Inserts the specified element at the specified position in this list.
        list.add(0, "Aloo"); //Aloo is added at index 0
        //list.add(12, "Chutney"); //Chutney is added at index 12 - Error - IndexOutOfBoundsException


        //4) Print
        //1) Print the list using for loop
        //2) ArrayList toString() method - Overide 

        System.out.println(list);

        //5) set(int index, E element) - Replaces the element at the specified position in this list with the specified element. - Update

          System.out.println("Before setting ->" + list);

        list.set(2,"Butter"); //Butter is added at index 2

        System.out.println("After setting ->" + list);


        //6) remove(int index) - Removes the element at the specified position in this list.

        list.remove(2); //Removes the element at index 2 - Butter
        System.out.println("After removing ->" + list);

       
    }
}
