//A HashSet is a collection of items where every item is unique, and it is found in the java.util package:
import java.util.HashSet; // Import the HashSet class
public class hashsett {

    
    

    public static void main(String[] args){

    HashSet<String> Tesouros = new HashSet<String>();
    
    Tesouros.add("Rubi");
    
    // To check whether an item exists in a HashSet, use the contains() method:
    // To remove an item, use the remove() method:
    // To remove all items, use the clear() method:
    // To find out how many items there are, use the size method:
    // Loop through the items of an HashSet with a for-each loop:

    for (String i : Tesouros) {
        System.out.println(i);
    }
    }
}
