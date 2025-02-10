import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

      /*  Develop a program that takes the weight (in kilograms) and height (in meters)
        as input and calculates the BMI, then prints it.
• Input: Weight (kg) = 70, Height (m) = 1.75
• Expected Output: BMI = 22.86
       */

        Scanner input = new Scanner(System.in);

        /*

        System.out.print("Hello, please enter your weight in kilogram");
        int user_weight = input.nextInt();


        System.out.print("Hello, please enter your height in meters");
        float  user_height = input.nextFloat();

        float BMI = (float) (user_weight / Math.pow(user_height,2));

        System.out.println("Your BMI is = " + BMI);

         */

      //  ---------------------------------------------------------------------------------------------------


//
//        Write a program that takes the obtained marks and total marks as input and
//        calculates the percentage, then prints it.
//• Input: Obtained Marks = 85, Total Marks = 100
//• Expected Output: Percentage = 85.0%
//

        /*
        int Total_marks = 100;

        System.out.print("please enter the student mark : ");
        double obtained_mark = input.nextDouble();


        double percentage = obtained_mark * 100  / 100;
        System.out.println("The students mark in percentage " +percentage + "%" );
*/



        //-----------------------------------------------------------------

//
//        Create a program that takes an amount in one currency and an exchange rate
//        as input, then converts and prints the amount in another currency.
//• Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
//• Expected Output: Amount in EUR = 85.0
//

        /*
        double Exchange_Rate =0.85;

        System.out.print("please enter the amount in USD : ");
        double USD = input.nextDouble();

        double to_EUR = USD * Exchange_Rate ;

        System.out.print("The amount in EUR : "+ to_EUR + " EUR");

        */


        //-----------------------------------------------------------------

//        Create a program that takes a string as input, calculates its length, and then
//        reverses the string using the StringBuilder class, finally printing both the length and
//        reversed string.
//• Input: "Hello, World!"
//• Expected Output: Length of the string: 13 And Reversed string: "!dlroW
//                ,olleH"

        /*
        System.out.print("please enter a string : ");
        String  Reverse_word = input.nextLine();

StringBuilder string_1 = new StringBuilder();
        string_1 = new StringBuilder(Reverse_word);
        string_1.reverse();
        System.out.print("The string length : " + Reverse_word.length()+
        "\n" + "The string in reverse : " +string_1 );
*/


        //-----------------------------------------------------------------
//        Develop a program that takes a sentence as input and extracts a substring from
//        it, then prints the extracted substring.
//• Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index
//                = 10, End Index = 20
//• Expected Output: "brown fox"

        /*
        System.out.println("Please enter a sentence :");
String sentence1 = input.nextLine();
     String sentence2 =  sentence1.substring(10,20);

        System.out.println("Subtracted sentence : "+ sentence2);
*/



//----------------------------------------------------------------------

//        Write a program that takes a sentence and a keyword as input, then check if
//        the keyword is present in the sentence and prints the result.
//• Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword =
//                "jumps"
//• Expected Output: Keyword "jumps" is present in the sentence.


        /*
        System.out.println("Please enter a sentence :");
        String random_sentence = input.nextLine();

        System.out.println("Please enter a Keyword :");
        String Keyword = input.nextLine();


        if (random_sentence.contains(Keyword)){
        System.out.println("The Keyword:" + Keyword+ " is present in the sentence.");
        }
*/
        //-----------------------------------------------------------------


//
//        Develop a program that takes a sentence and a word to replace as input, then
//        replace all occurrences of the word with another word and prints the modified
//        sentence.
//• Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to
//        Replace = "fox", Replacement Word = "cat"
//• Expected Output: "The quick brown cat jumps over the lazy dog"

/*
        System.out.println("Please enter a sentence :");
        String original_sentence = input.nextLine();

        System.out.println("Please enter the word to replace :");
        String original_word = input.nextLine();

        System.out.println("Please enter the word in replace :");
        String replace_word = input.nextLine();

        String new_sentence = original_sentence.replaceAll(original_word,replace_word);

        System.out.println(" The new sentence with the replaced word : "+ new_sentence);

*/

        //-----------------------------------------------------------------

//
//
//        Write a program that takes two strings as input and check if they are equal,
//                ignoring the case, then prints whether they are equal or not.
//• Input: String 1 = "Hello", String 2 = "hello"
//• Expected Output: Strings are equal (ignoring case).

        System.out.println("Please enter the first word :");
        String input1 = input.nextLine();

        System.out.println("Please enter the second word :");
        String input2 = input.nextLine();

        boolean check_equal= input1.equalsIgnoreCase(input2);

        if (check_equal== true) {
            System.out.println(" the Strings are equal (ignoring case). :");
        }else
            System.out.println(" the Strings are NOT equal (ignoring case). :");


    }




    }
