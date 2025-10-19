package Week4Project;
//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
public class Week4Project {
    public static void main(String[] args) { // Normal Java headers
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; // Array with an int type that then declares the list of requested numbers.

	//  a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
        int subtractLast = ages[ages.length - 1] - ages[0]; // Initiated  an integer array list that grabs the last emelent of the array with ".length" and subtracting it from the array location "ages[0]"
        System.out.println("Result: " + subtractLast); 

	//  b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
		//      i. Make sure that there are 9 elements of type int in this new array.  
		//      ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
		//      iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
        int[] ages2 = new int[9];
            ages2[0] = 5; 
            ages2[1] = 12;
            ages2[2] = 18;
            ages2[3] = 7; // Each location of the "ages2" array are declared by number, with an integer added to each.
            ages2[4] = 34;
            ages2[5] = 50;
            ages2[6] = 3;
            ages2[7] = 27;
            ages2[8] = 45;
        int result2 = ages2[ages2.length - 1] - ages2[0];
            System.out.println("Result with ages2: " + result2);

	//  c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
int sum = 0; // Declaring with an empty starting integer.
        for (int age : ages) { // Created an "enhanced for" loop that says within the "ages" collection, in each iteration of the loop a new variable integer "age" over the elements of "ages".
            sum += age; // During each iteration, the age would be added to the sum, each age being added each iteration at a time until the length of ages is completed.
        }
        double average = (double) sum / ages.length;  // declared double variable "average" equals the sum variable, devided by the length of ages, which equals the average.
        System.out.println("Average age: " + average); // Printing out the result.
//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; // Declared the string array "names" added with the requested names.

	//  a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
int totalLetters = 0; // Started empty integer variable counter.
        for (String name1 : names) {
            totalLetters += name1.length(); // Using an enhanced for loop to create a string variable "name" with each iteration within the "names" array, for each iteration, totalLetters is added to for each of the names array locations, which were allocated to a "name" variable.
        }
        double avgLetters = (double) totalLetters / names.length; // Double variable "avgLetters" is declared, with the totalLetters variable from above divided by the names array length.
        System.out.println("Average letters: " + avgLetters); // Printed out results.

	//  b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
StringBuilder concatenated = new StringBuilder(); // Using a StringBuilder, concatenated with a "for loop" into the Names array with the name variable.  During each iteration, the string builder appended a name to the names array with a space added to each iteration.
        for (String name2 : names) {
            concatenated.append(name2).append(" ");
        }
        System.out.println("Concatenated names: " + concatenated); // Printing out the string builder "concatenated" variable.

//3. How do you access the last element of any array?
String last = names[names.length - 1]; // The last number of an array is accessed by the "-1" of the array's length to location of the last item in the array's contents.
        System.out.println("Last Name listed: " + last);

//4. How do you access the first element of any array?
String first = names[0]; // The first element of an array is location "0"
        System.out.println("First Name listed: " + first);

//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
        int[] nameLengths = new int[names.length];

        for (int i = 0; i < names.length; i++) { // Populate nameLengths with lengths of each name
            nameLengths[i] = names[i].length();
        }
                
        System.out.print("nameLengths: "); // Print the nameLengths array
        for (int nameLength1 : nameLengths) {
            System.out.print(nameLength1 + " ");
        }
        System.out.println();

//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
int sumLengths = 0; // Declared integer variaable sumLengths.
for (int length : nameLengths) { // For loop that for each iteration added declared integer "length" variable to the nameLengths array
    sumLengths += length; // For each iteration, the length is added to the previously declared sumLengths variable.
}
System.out.println("Sum of nameLengths: " + sumLengths);

result(args);

}
//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”). 
    public static String repeatWord(String word, int n) {  // Declared the method repeatWord that takes in a string "Word" and an integer "n".
        StringBuilder sb = new StringBuilder(); // Stringbuilder sb declared
        for (int i = 0; i < n; i++) { // For loop created that starts as index as zero, as long as the index is less than n, append "sb" with the added "word", then adding to the index by one...
            sb.append(word);
        }
        return sb.toString(); // Returning "sb" as a string.
    }
    
    public static void result(String[] arg) {
        String result = repeatWord("Hello", 3); 
        System.out.println("Repeated: " + result);
    } 
//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).

    public static String getFullName(String firstName, String lastName) { // Method established with first and last names added into the method, which returns the concatentated first and last name to make the full name.
        return firstName + " " + lastName;
    }

//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
    public static boolean isSumGreaterThan100(int[] arr) { // method declared as in integer which passes in arr (array of integers).
        int total = 0; // initiated an integer variable "total"
        for (int num : arr) { // for loop created which will recall "num" within arr for every iteration.
            total += num; // adds to total from num through every iteration
        }
        return total > 100; // returns boolean true for the results if over 100.
    }

//10. Write a method that takes an array of double and returns the average of all the elements in the array.
    public static double average(double[] arr) { // Method created with double "average" which then passes in arr.
        double sum = 0; // double variable "sum" declared, starting with 0
        for (double v : arr) { // for loop that iterates a double "v" variable within arr for every iteration
            sum += v; //adds v to sum for every iteration
        }
        return sum / arr.length; //finds average by dividing the sum by the length of arr
    }

//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
    public static boolean isFirstAvgGreater(double[] a, double[] b) { // Method declared "isFirstAvgGreater" that passed in double "a" and double "b"
    return average(a) > average(b); // Returns boolean result if average a is bigger than average b, from the method below passing into this to find the average of a and b.
    }

//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { // Declares the boolean willBuyDrink method which passes in boolean isHotOutside and moneyInPocket.
        return isHotOutside && moneyInPocket > 10.50; // Returns True ifHotOutside is true AND moneyInPocket is higher than 10.5.
    }

//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

    public static double circleArea(double radius) { // Declared a method "circleArea" that passes in the double "radius". Overall, the method was created as a simple area calculation of a circle. I never remember how to calculate this, so if this could be plugged into a website or simple application I could initiate, all I would need to do (if I added a scanner input) input the radius and it will find the results for me.
        return Math.PI * radius * radius; // Returns the results by using the Math tool "pi", multiplying it by radius and radius again (radius squared).
    }

}