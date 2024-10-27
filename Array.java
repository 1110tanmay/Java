import java.util.*;
public class Array {
//Taking user input
    static String userInput(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter car name:");
        String carName = myObj.nextLine();
        return carName;
    }
    public static void main (String[]args){
    String[] cars = {"Volvo", "Mercedes", "BMW", "Ford", "Tata", " Ferrari"};
    for(int i=0 ; i<=5;i++){
        System.out.println(cars[i]);
    }
    String carName = userInput();
    System.out.println(userInput());
}
}
//tanmay testing branch change.