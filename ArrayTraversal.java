import java.util.Scanner;
public class ArrayTraversal {
   static  int choice;

   public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); //Created a scanner object
    System.out.println("Hello, are the cars available in the store!");
    String [] cars = {"Mercedes", "BMW", "Maruti", "Ford", "Nissan"};
   // int [] num = {1,2,3,4,5};
    //Traversing array
    for(int i = 0; i<cars.length;++i){
        System.out.println(cars[i]);
    }
    System.out.println("Which car would you like to buy?");
    int choice = myObj.nextInt();
}

    //Method for Mercedes
   public static int Mercedes(int choice){
    System.out.println("Mercedes is a beautiful car! What do would you list to know about it?\n1.Cost\n2.Emissions\n3.Colour");
    int input;
    int carChoice;
    switch (input) {
        case 1:
            System.out.println("The car costs about $35000, would you like to buy it? Press 1 for yes and 2 for no.");
            carChoice = myObj.nextInt();
            break;
        default:
            throw new AssertionError();
    }
    return choice;
   };

   //Method for BMW
   public static int BMW(int choice){
    return choice;
   };
   
   //Method for Maruti
   public static int Maruti(int choice){
    return choice;
   };

   //Method for Ford
   public static int Ford(int choice){
    return choice;
   };

   //Method for Nissan
   public static int Nissan(int choice){
    return choice;
   };

   //Main Method
}
//Testing Github repo

