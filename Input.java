import java.util.Scanner;
//importing the Scanner library
public class Input{
    public static void main(String[]args)
    {
        Scanner myObj = new Scanner(System.in);
        int choice = 1;
        String userName;
        int age;
        while(choice == 1){
        System.out.println("Enter your name:");
        userName = myObj.nextLine();

        System.out.println("Enter your age:");
        age = myObj.nextInt();
            if(age>=18){
                System.out.println("Welcome to the club!");
            }
            else{
                System.out.println("You're not allowed to enter the club");
            }
            System.out.println("Do you want to try again?\nPress 1 for yes and 2 for no.");
            choice = myObj.nextInt();
            myObj.nextLine();
        }
        System.out.println("Thank you!");
    }
}
//testing branch commit
//testing commit branch