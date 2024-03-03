

//ex 1. Create a functional interface that takes a list of integers and returns a list of integers. Use a lambda expression to implement this interface, such that it returns a list containing only the odd numbers from the original list.
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface FilterOddNumbers {
    List<Integer> filter(List<Integer> numbers);
}

public class OddNumbersFilter {
    public static void main(String[] args) {
        // Example usage
        List<Integer> originalList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Using a lambda expression to implement the functional interface
        FilterOddNumbers oddNumbersFilter = numbers -> numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        // Applying the filter and printing the result
        List<Integer> result = oddNumbersFilter.filter(originalList);
        System.out.println("Original List: " + originalList);
        System.out.println("List of Odd Numbers: " + result);
    }
// ex 2 Create a functional interface with a method that takes a List<String> representing first names and returns a List<String> of those names formatted in uppercase. Implement it using a lambda expression.
@FunctionalInterface
interface FormatNames {
    List<String> format(List<String> names);
}

    public class UppercaseNameFormatter {
        public static void main(String[] args) {
            // Example usage
            List<String> originalNames = List.of("Alice", "Bob", "Charlie", "David");

            // Using a lambda expression to implement the functional interface
            FormatNames uppercaseFormatter = names -> names.stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());

            // Applying the formatter and printing the result
            List<String> result = uppercaseFormatter.format(originalNames);
            System.out.println("Original Names: " + originalNames);
            System.out.println("Uppercase Formatted Names: " + result);
        }
    }
    // ex 3 Create a functional interface that is generic and takes a list of generic items and a single generic item, returning a boolean indicating whether the item is in the list. Implement this interface using a lambda expression.
    @FunctionalInterface
    interface ListContains<T> {
        boolean contains(List<T> list, T item);
    }

    public class GenericListContains {
        public static void main(String[] args) {
            // Example usage with Integer
            List<Integer> numbers = List.of(1, 2, 3, 4, 5);
            int targetNumber = 3;

            // Using a lambda expression to implement the generic functional interface
            ListContains<Integer> containsChecker = (list, item) -> list.contains(item);

            // Checking if the item is in the list and printing the result
            boolean result = containsChecker.contains(numbers, targetNumber);
            System.out.println("List: " + numbers);
            System.out.println("Is " + targetNumber + " in the list? " + result);
        }
    }
    // ex 4 Create a functional interface that takes a single double as a parameter and returns a double. Implement it using a lambda expression to create a utility that returns the square root of the input value.
    @FunctionalInterface
    interface SquareRootCalculator {
        double calculateSquareRoot(double value);
    }

    public class SquareRootUtility {
        public static void main(String[] args) {
            // Example usage
            double inputValue = 25.0;

            // Using a lambda expression to implement the functional interface
            SquareRootCalculator squareRootCalculator = Math::sqrt;

            // Calculating and printing the square root of the input value
            double result = squareRootCalculator.calculateSquareRoot(inputValue);
            System.out.println("Square root of " + inputValue + ": " + result);
        }
    }