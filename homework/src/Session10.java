//ex. 1 Write a Java program to create a new array list, add some colors (string) and print out the collection.
import java.util.ArrayList;

public class ColorArrayListExample {
    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colorsList = new ArrayList<>();

        // Add colors to the ArrayList
        colorsList.add("Red");
        colorsList.add("Blue");
        colorsList.add("Green");
        colorsList.add("Yellow");
        colorsList.add("Orange");

        // Print out the collection
        System.out.println("Colors in the ArrayList:");
        for (String color : colorsList) {
            System.out.println(color);
        }
    }
//ex 2 Write a Java program to insert an element into the array list at the first position.
public class InsertAtFirstPosition {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> colorsList = new ArrayList<>();

        // Add some colors to the ArrayList
        colorsList.add("Blue");
        colorsList.add("Green");
        colorsList.add("Yellow");

        // Print the ArrayList before insertion
        System.out.println("Colors before insertion: " + colorsList);

        // Insert a new color at the first position
        colorsList.add(0, "Red");

        // Print the ArrayList after insertion
        System.out.println("Colors after insertion: " + colorsList);
    }
//ex 3 Write a Java program to retrieve an element (at a specified index) from a given array list.
public class RetrieveElementAtIndex {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> colorsList = new ArrayList<>();

        // Add some colors to the ArrayList
        colorsList.add("Red");
        colorsList.add("Blue");
        colorsList.add("Green");
        colorsList.add("Yellow");

        // Specify the index to retrieve an element
        int indexToRetrieve = 2;

        // Check if the index is valid
        if (indexToRetrieve >= 0 && indexToRetrieve < colorsList.size()) {
            // Retrieve the element at the specified index
            String retrievedColor = colorsList.get(indexToRetrieve);

            // Print the retrieved element
            System.out.println("Element at index " + indexToRetrieve + ": " + retrievedColor);
        } else {
            System.out.println("Invalid index specified.");
        }
    //ex. 7 Write a Java program to insert the specified element at the front of a linked list.
        public class InsertAtFrontOfLinkedList {
            public static void main(String[] args) {
                // Create a LinkedList
                LinkedList<String> colorsList = new LinkedList<>();

                // Add some colors to the LinkedList
                colorsList.add("Blue");
                colorsList.add("Green");
                colorsList.add("Yellow");

                // Print the LinkedList before insertion
                System.out.println("Colors before insertion: " + colorsList);

                // Insert a new color at the front of the LinkedList
                colorsList.addFirst("Red");

                // Print the LinkedList after insertion
                System.out.println("Colors after insertion: " + colorsList);
            }
        }
        //ex 8 Write a Java program to insert the specified element at the end of a linked list.
        public class InsertAtEndOfLinkedList {
            public static void main(String[] args) {
                // Create a LinkedList
                LinkedList<String> colorsList = new LinkedList<>();

                // Add some colors to the LinkedList
                colorsList.add("Blue");
                colorsList.add("Green");
                colorsList.add("Yellow");

                // Print the LinkedList before insertion
                System.out.println("Colors before insertion: " + colorsList);

                // Insert a new color at the end of the LinkedList
                colorsList.addLast("Red");

                // Print the LinkedList after insertion
                System.out.println("Colors after insertion: " + colorsList);
            }
        // ex. 10 Write a Java program to append the specified element to the end of a hash set.
        public class AppendToHashSet {
            public static void main(String[] args) {
                // Create a HashSet
                HashSet<String> colorsSet = new HashSet<>();

                // Add some colors to the HashSet
                colorsSet.add("Red");
                colorsSet.add("Blue");
                colorsSet.add("Green");

                // Print the HashSet before appending
                System.out.println("Colors before appending: " + colorsSet);

                // Append a new color to the HashSet
                String newColor = "Yellow";
                colorsSet.add(newColor);

                // Print the HashSet after appending
                System.out.println("Colors after appending: " + colorsSet);
            }
            // ex 11 11. Write a Java program to get the number of elements in a hash set.
            public class AppendToHashSet {
                public static void main(String[] args) {
                    // Create a HashSet
                    HashSet<String> colorsSet = new HashSet<>();

                    // Add some colors to the HashSet
                    colorsSet.add("Red");
                    colorsSet.add("Blue");
                    colorsSet.add("Green");

                    // Print the HashSet before appending
                    System.out.println("Colors before appending: " + colorsSet);

                    // Append a new color to the HashSet
                    String newColor = "Yellow";
                    colorsSet.add(newColor);

                    // Print the HashSet after appending
                    System.out.println("Colors after appending: " + colorsSet);
                }
                // ex 12 Write a Java program to empty a hash set.
                public class EmptyHashSet {
                    public static void main(String[] args) {
                        // Create a HashSet
                        HashSet<String> colorsSet = new HashSet<>();

                        // Add some colors to the HashSet
                        colorsSet.add("Red");
                        colorsSet.add("Blue");
                        colorsSet.add("Green");

                        // Print the HashSet before emptying
                        System.out.println("Colors before emptying: " + colorsSet);

                        // Empty the HashSet
                        colorsSet.clear();

                        // Print the HashSet after emptying
                        System.out.println("Colors after emptying: " + colorsSet);
                    }
                }