// ex. 1 Write a method named displayTodaysDate that, when called, prints the current date to the console.

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DisplayTodaysDate {
    public static void main(String[] args) {
        // Call the displayTodaysDate method
        displayTodaysDate();
    }

    // Method to display the current date
    public static void displayTodaysDate() {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Format the date using a DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDate.format(formatter);

        // Print the formatted date to the console
        System.out.println("Today's Date: " + formattedDate);
    }
//ex. 2
    public class DisplayDateComponents {
        public static void main(String[] args) {
            // Example date
            LocalDate exampleDate = LocalDate.of(2022, 3, 5);

            // Call the displayDateComponents method
            displayDateComponents(exampleDate);
        }

        // Method to display the components of a date
        public static void displayDateComponents(LocalDate date) {
            // Extract year, month, and day components
            int year = date.getYear();
            int month = date.getMonthValue();
            int day = date.getDayOfMonth();

            // Print the components separately
            System.out.println("Year: " + year);
            System.out.println("Month: " + month);
            System.out.println("Day: " + day);
        }
    //ex. 3  Write a method named areDatesEqual that reads two dates from the console and returns true if they are equal, and false otherwise (format YYYY-MM-DD)
    public class AreDatesEqual {
        public static void main(String[] args) {
            // Read two dates from the console
            System.out.print("Enter the first date (YYYY-MM-DD): ");
            String inputDate1 = new Scanner(System.in).nextLine();

            System.out.print("Enter the second date (YYYY-MM-DD): ");
            String inputDate2 = new Scanner(System.in).nextLine();

            // Call the areDatesEqual method
            boolean result = areDatesEqual(inputDate1, inputDate2);

            // Print the result
            System.out.println("Are the dates equal? " + result);
        }

        // Method to check if two dates are equal
        public static boolean areDatesEqual(String dateStr1, String dateStr2) {
            // Parse the input strings into LocalDate objects
            LocalDate date1 = LocalDate.parse(dateStr1, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            LocalDate date2 = LocalDate.parse(dateStr2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            // Compare the LocalDate objects
            return date1.equals(date2);
        }
       // ex. 4 Write a method named isTodaySpecificDate that checks if today's date is a date received from the user (so the user type in a date, and compare that date with today's date, return true or false).
       public class IsTodaySpecificDate {
           public static void main(String[] args) {
               // Read a date from the user
               System.out.print("Enter a date (YYYY-MM-DD): ");
               String userInputDate = new Scanner(System.in).nextLine();

               // Call the isTodaySpecificDate method
               boolean result = isTodaySpecificDate(userInputDate);

               // Print the result
               System.out.println("Is today the entered date? " + result);
           }

           // Method to check if today's date is equal to a specific date
           public static boolean isTodaySpecificDate(String userInputDate) {
               // Parse the user input date into a LocalDate object
               LocalDate specifiedDate = LocalDate.parse(userInputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

               // Get today's date
               LocalDate currentDate = LocalDate.now();

               // Compare the two dates
               return currentDate.equals(specifiedDate);
           }
       //ex. 5 Write a method named displayCurrentTime that prints the current time to the console (format HH:MM:SS).
       public class DisplayCurrentTime {
           public static void main(String[] args) {
               // Call the displayCurrentTime method
               displayCurrentTime();
           }

           // Method to display the current time
           public static void displayCurrentTime() {
               // Get the current time
               LocalTime currentTime = LocalTime.now();

               // Format the time using a DateTimeFormatter
               DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
               String formattedTime = currentTime.format(formatter);

               // Print the formatted time to the console
               System.out.println("Current Time: " + formattedTime);
           }
       // ex. 7 Design a method titled daysBetween that reads two dates from the console and computes the total number of days between them.
       public class DaysBetweenDates {
           public static void main(String[] args) {
               // Read two dates from the console
               System.out.print("Enter the first date (YYYY-MM-DD): ");
               String inputDate1 = new Scanner(System.in).nextLine();

               System.out.print("Enter the second date (YYYY-MM-DD): ");
               String inputDate2 = new Scanner(System.in).nextLine();

               // Call the daysBetween method
               int result = daysBetween(inputDate1, inputDate2);

               // Print the result
               System.out.println("Total number of days between the two dates: " + result);
           }

           // Method to compute the total number of days between two dates
           public static int daysBetween(String dateStr1, String dateStr2) {
               // Parse the input strings into LocalDate objects
               LocalDate date1 = LocalDate.parse(dateStr1, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
               LocalDate date2 = LocalDate.parse(dateStr2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

               // Calculate the number of days between the two dates
               int daysBetween = Math.abs((int) (date1.toEpochDay() - date2.toEpochDay()));

               return daysBetween;
           }