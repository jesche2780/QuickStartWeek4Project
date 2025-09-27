//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
public class Week4Project {
	    public static void main(String[] args) {
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

	//  a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
int subtractLast = ages[ages.length - 1] - ages[0];
        System.out.println("Result: " + subtractLast);

	//  b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
		//      i. Make sure that there are 9 elements of type int in this new array.  
		//      ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
		//      iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
int[] ages2 = new int[9];
        ages2[0] = 5; 
        ages2[1] = 12;
        ages2[2] = 18;
        ages2[3] = 7;
        ages2[4] = 34;
        ages2[5] = 50;
        ages2[6] = 3;
        ages2[7] = 27;
        ages2[8] = 45;
        int result2 = ages2[ages2.length - 1] - ages2[0];
        System.out.println("Result with ages2: " + result2);

	//  c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double average = (double) sum / ages.length;
        System.out.println("Average age: " + average);
    }

//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
    public static void namesList(String[] args) {
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

	//  a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double avgLetters = (double) totalLetters / names.length;
        System.out.println("Average letters: " + avgLetters);

	//  b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
StringBuilder concatenated = new StringBuilder();
        for (String name : names) {
            concatenated.append(name).append(" ");
        }
        System.out.println("Concatenated names: " + concatenated.toString().trim());
    }

//3. How do you access the last element of any array?
//int last = ages[ages.length - 1];

//4. How do you access the first element of any array?
//int first = ages[0];

//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
public class NameLengths {
    public static void nameLengths(String[] args) {
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        int[] nameLengths = new int[names.length];

        // Populate nameLengths with lengths of each name
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        // Print the nameLengths array
        System.out.print("nameLengths: ");
        for (int length : nameLengths) {
            System.out.print(length + " ");
        }
        System.out.println();
}
//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
int sumLengths = 0;
for (int length : nameLengths) {
    sumLengths += length;
}
System.out.println("Sum of nameLengths: " + sumLengths);

//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
public class StringRepeater {
    public static String repeatWord(String word, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(word);
        }
        return sb.toString();
    }

    public static void secondRepeatWord(String[] args) {
        String result = repeatWord("Hello", 3);
        System.out.println("Repeated: " + result);
    }
}

//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
public class FullName {
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        System.out.println("Full Name: " + getFullName("John", "Doe"));
    }
}

//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
public class SumChecker {
    public static boolean isSumGreaterThan100(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total > 100;
    }

    public static void resultData(String[] args) {
        int[] data = {10, 20, 30, 40, 5};
        System.out.println("Sum > 100: " + isSumGreaterThan100(data));
    }
}

//10. Write a method that takes an array of double and returns the average of all the elements in the array.
public class DoubleAverage {
    public static double average(double[] arr) {
        double sum = 0;
        for (double v : arr) {
            sum += v;
        }
        return sum / arr.length;
    }

    public static void elementsArray(String[] args) {
        double[] data = {2.5, 3.5, 4.0, 10.0};
        System.out.println("Average: " + average(data));
    }
}

//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
public class AverageComparator {
    public static boolean isFirstAvgGreater(double[] a, double[] b) {
        return average(a) > average(b);
    }

    private static double average(double[] arr) {
        double sum = 0;
        for (double v : arr) {
            sum += v;
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        double[] first = {5.0, 10.0, 15.0};
        double[] second = {2.0, 4.0, 6.0};
        System.out.println("First avg greater: " + isFirstAvgGreater(first, second));
    }
}

//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
public class WillBuyDrink {
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }

    public static void main(String[] args) {
        System.out.println("Will buy drink: " + willBuyDrink(true, 11.00));
    }
}

//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
public class CircleUtils {

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double r = 3.5;
        System.out.println("Circle area for radius " + r + ": " + circleArea(r));
    }
}

}

}