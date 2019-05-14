import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numberCollection = new ArrayList<>();
        for(int i=1; i <=10; i++) numberCollection.add(i);
//        Exercise1();
//        Exercise2();
//        Exercise3();
//        Exercise4();
//        System.out.println(Exercise5Max(numberCollection));
//        System.out.println(Exercise5Min(numberCollection));
//        Exercise6();
        Exercise7();
    }
    private static void Exercise1()
    {
        Scanner scan = new Scanner(System.in);
//        Exercise 1:
//        Ask the user to enter for names in an array. Print the array
        System.out.println("I need four names");
        String name1 = scan.next();
        String name2 = scan.next();
        String name3 = scan.next();
        String name4 = scan.next();
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add(name1);
        nameList.add(name2);
        nameList.add(name3);
        nameList.add(name4);

        System.out.println(nameList);
    }
    private static void Exercise2()
    {
//        Exercise 2:
//        Create the array [5,3,7, 4].
//        Pass the array to a new function to do the following:
//            Print the array.
//            Print the 3rd index of the numberList.
//            Delete the second index.
//            Print the 3rd index again.
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(5);
        numberList.add(3);
        numberList.add(7);
        numberList.add(4);
        System.out.println(numberList);
        System.out.println(numberList.get(2));
        numberList.remove(2);
        System.out.println(numberList.get(2));
    }
    private static void Exercise3()
    {
//        Exercise 3:
//        Create the array ["Bob", "John", "Kenn", "Kevin"].
//        Remove “Kenn” from the array.
//            Print the array.
//        Print the size of the array.
//        Check to see if the array contains “Kevin”. If so, get the index of “Kevin” to print.
        String[] test = {"Bob", "John", "Kenn", "Kevin"};
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Bob");
        nameList.add("John");
        nameList.add("Kenn");
        nameList.add("Kevin");
        nameList.remove("Kenn");
        System.out.println(nameList);
        System.out.println(nameList.size());
        if(nameList.contains("Kevin"))
        System.out.println(nameList.indexOf("Kevin"));
    }
    private static void Exercise4()
    {
        Scanner scan = new Scanner(System.in);
//        Exercise 4:
//        Ask the user to enter 5 numbers.
//        Put them in an array and print the sum.
        System.out.println("I need five numbers");
        Integer number1 = scan.nextInt();
        Integer number2 = scan.nextInt();
        Integer number3 = scan.nextInt();
        Integer number4 = scan.nextInt();
        Integer number5 = scan.nextInt();
        ArrayList<Integer> userNumberList = new ArrayList<>();
        userNumberList.add(number1);
        userNumberList.add(number2);
        userNumberList.add(number3);
        userNumberList.add(number4);
        userNumberList.add(number5);
            Integer count = 0;
            for(Integer number : userNumberList)
            {
                count += number;
            }
            System.out.println(count);
    }

    private static Integer Exercise5Max(ArrayList<Integer> array)
    {
//        Exercise 5:
//        Create an array in the main function.
//        Create two functions, min and max, to find the minimum and maximum values.
//        Do not use a min/max function.
        int count = 0 ;
        for(Integer number : array)
        {
            if(number > count)
            {
                count = number;
            }
        }
        return count;

    }
    private static Integer Exercise5Min(ArrayList<Integer> array)
    {
        int result = 10;
        for(Integer number : array)
        {
            if(number < result)
            result = number;
        }
//        Exercise 5:
//        Create an array in the main function.
//        Create two functions, min and max, to find the minimum and maximum values.
//        Do not use a min/max function.
        return result;
    }
    private static void Exercise6()
    {
        Scanner scan = new Scanner(System.in);
//        Exercise 6:
//        Create a program that will add all numbers given to a program until the number 0 is pressed.
//        Then return the total of all numbers.
        Integer number = 0;
        Integer total = 0;
        do
            {
                System.out.println("Please give me a number not 0");
                number = scan.nextInt();
                if(number != 0)
                {
                    total += number;
                }
                else
                    {
                        break;
                    }
            }while (true);
        System.out.println(total);
    }
    private static void Exercise7()
    {
        Scanner scan = new Scanner(System.in);
//        Exercise 7:
//        Allow a user enter as many strings as they want to until they enter the character 'q'.
//        Check to see if the strings are similar to a palindrome.

        do {
            System.out.println("Say Something");
            String input = scan.next();
            if(input.equalsIgnoreCase("q"))
            {
                break;
            }
        }while (true);
    }
}
