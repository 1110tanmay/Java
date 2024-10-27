import java.util.Scanner;
public class MethodTest {
    //Globally declaring the variables
    int num1, num2, result;

   //Declaring methods
    static int addition(int num1, int num2){
        int result = num1+num2;
        return result;
    }

    static float subtraction(int num1, int num2){
        float result = num1-num2;
        return result;
    }

    static float  division(int num1, int num2){
        float result = num1/num2;
        return result;
    }

    static double multiplication(int num1, int num2){
        double result = num1*num2;
        return result;
    }

//Below is the main method
    public static void main(String[]args)
    {
        Scanner myObj = new Scanner(System.in);
        int choice = 1;
        while(choice == 1){
        System.out.println("Hi there! Enter first number:");
        int num1 = myObj.nextInt();

        System.out.println("Enter the second number:");
        int num2 = myObj.nextInt();

        System.out.println("Enter the operation you would like to perform:\n1. Addition\n2. Subtraction \n3. Division \n4. Mutiplication");
        int userChoice = myObj.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println("The addition of the numbers is: " + addition(num1,num2));
                break;
                case 2:
                System.out.println("The subtraction of the numbers is: " + subtraction(num1,num2));
                break;
                case 3:
                System.out.println("The division of the numbers is: " + division(num1, num2));
                break;
                case 4:
                System.out.println("The multiplication of the numbers is: " + multiplication(num1,num2));
                break;
            default:
                System.out.println("Enter a valid choice");;
        }
        System.out.println("Do you wish to continue?\nPress 1 for yes, 2 for no.");
        choice = myObj.nextInt();
    }
    System.out.println("Thank you for using!");
    }
}
