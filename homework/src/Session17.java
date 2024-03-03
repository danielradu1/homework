

// ex 1 Given a list of integers, create a new list that contains only the even numbers. Use streams to achieve this.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        // Example list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Use streams to filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        // Print the original list and the list of even numbers
        System.out.println("Original List: " + numbers);
        System.out.println("Even Numbers: " + evenNumbers);
    }
}
// ex 2  Using a list of strings, find and print the longest string using Java streams.
public class LongestStringFinder {
    public static void main(String[] args) {
        // Example list of strings
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "grapefruit", "orange");

        // Use streams to find the longest string
        String longestString = strings.stream()
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .orElse(null);

        // Print the original list and the longest string
        System.out.println("Original List: " + strings);
        System.out.println("Longest String: " + longestString);
    }
}

//ex 3 Create a stream of numbers from 1 to 100 and use the filter operation to retain only those numbers which are prime.
import java.util.stream.IntStream;

public class PrimeNumbersFilter {
    public static void main(String[] args) {
        // Create a stream of numbers from 1 to 100 and filter prime numbers
        IntStream primeNumbers = IntStream.rangeClosed(1, 100)
                .filter(PrimeNumbersFilter::isPrime);

        // Print the prime numbers
        System.out.println("Prime Numbers from 1 to 100: ");
        primeNumbers.forEach(System.out::println);
    }

    // Method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
   // ex. 4 Given a list of strings, use streams to create a single string which is a concatenation of all strings separated by a comma.
   public class ConcatenateStrings {
       public static void main(String[] args) {
           // Example list of strings
           List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange");

           // Use streams to concatenate strings with a comma separator
           String concatenatedString = strings.stream()
                   .collect(Collectors.joining(", "));

           // Print the original list and the concatenated string
           System.out.println("Original List: " + strings);
           System.out.println("Concatenated String: " + concatenatedString);
       }
   }
   // ex 5 Given a list of people (a class) with attributes: first name, last name, and age; use streams to find all people who are older than 18 years.
   class Person {
       private String firstName;
       private String lastName;
       private int age;

       // Constructor
       public Person(String firstName, String lastName, int age) {
           this.firstName = firstName;
           this.lastName = lastName;
           this.age = age;
       }

       // Getters
       public String getFirstName() {
           return firstName;
       }

       public String getLastName() {
           return lastName;
       }

       public int getAge() {
           return age;
       }

       @Override
       public String toString() {
           return "Person{" +
                   "firstName='" + firstName + '\'' +
                   ", lastName='" + lastName + '\'' +
                   ", age=" + age +
                   '}';
       }
   }

    public class OlderThan18Filter {
        public static void main(String[] args) {
            // Example list of people
            List<Person> people = Arrays.asList(
                    new Person("John", "Doe", 25),
                    new Person("Alice", "Smith", 22),
                    new Person("Bob", "Johnson", 30),
                    new Person("Eva", "Brown", 18)
            );
        }
    }
    // ex 6  Create a stream of integers from an array and find the sum of all integers using the reduce method.
import Arrays;

    public class SumOfIntegers {
        public static void main(String[] args) {
            // Example array of integers
            int[] numbers = {1, 2, 3, 4, 5};

            // Use a stream to find the sum of integers using the reduce method
            int sum = Arrays.stream(numbers)
                    .reduce(0, Integer::sum);

            // Print the original array and the sum of integers
            System.out.println("Original Array: " + Arrays.toString(numbers));
            System.out.println("Sum of Integers: " + sum);
        }
    }
    // ex 7 Use streams to transform a list of strings into a list of their respective lengths.
    public class StringLengthTransformer {
        public static void main(String[] args) {
            // Example list of strings
            List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange");

            // Use streams to transform the list into a list of string lengths
            List<Integer> lengths = strings.stream()
                    .map(String::length)
                    .collect(Collectors.toList());

            // Print the original list and the list of string lengths
            System.out.println("Original List of Strings: " + strings);
            System.out.println("List of String Lengths: " + lengths);
        }
    }