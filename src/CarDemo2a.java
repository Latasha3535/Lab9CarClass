import java.util.Scanner;

public class CarDemo2a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


// Ask the user to input a number of car they would like enter

        int num = getInt(scan, " How many cars do you want to enter:");
        CarClass [] CarList = new CarClass [num];


        int total = 0;
        int count = 0;

        for (int i = 0; i < num; i++) {
            System.out.println("What is the make of the car: "   );
            String make= scan.next();
            System.out.println("What is the model of the car: "  );
            String model= scan.next();
            System.out.println("What is the year of the car: "  );
            int year = scan.nextInt();
            System.out.println("What is the price of the car: "  );
            Double price= scan.nextDouble();

            CarList[i] = new CarClass(make , model, year, price);
        }

        for (int i= 0; i < CarList.length ; i++) {
            System.out.println(CarList[i]);
        }

    }



    public static int getInt (Scanner sc, String prompt) {
//        String prompt = "Please enter an integer: ";
        System.out.print(prompt);
        int n = 0;

        //as long as there's NOT an int
        //prompt the user to enter again
        while (!sc.hasNextInt()) {
            sc.nextLine();

            System.out.print("I'm sorry, that's not an int. " +
                    prompt);
        }

        //once there is an int,
        // take it as input
        n = sc.nextInt();
        sc.nextLine(); //clear out the enter here

        return n;
    }
}