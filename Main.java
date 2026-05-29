  // Main class to run the hotel room reservation system
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

           // Scanner ( to take input from user)
        Scanner input = new Scanner(System.in);

        // ROOMS ( create objects using inheritance)
        Room r100 = new OneBedRoom(100);
        Room r101 = new OneBedRoom(101);
        Room r102 = new OneBedRoom(102);

        Room r103 = new TwoBedRoom(103);
        Room r104 = new TwoBedRoom(104);
        Room r105 = new TwoBedRoom(105);

        Room r106 = new DeluxeRoom(106);
        Room r107 = new DeluxeRoom(107);
        Room r108 = new DeluxeRoom(108);
             // Menu display
        System.out.println("===== HOTEL SYSTEM =====");
        System.out.println("1. Show Rooms");
        System.out.println("2. Book Room");
        System.out.print("Choose: ");

        int choice = input.nextInt();

        // SHOW ROOMS 
        if (choice == 1) {

            System.out.println("--- ONE BEDROOM ---");
            System.out.println("Rooms: 100 101 102");
            System.out.println("Features: WiFi, TV, Room Service, Breakfast, AC");
            System.out.println("Price: 2000 per day");

            System.out.println("--- TWO BEDROOM ---");
            System.out.println("Rooms: 103 104 105");
            System.out.println("Features: WiFi, TV, Balcony, Coffee Machine, Breakfast");
            System.out.println("Price: 3000 per day");

            System.out.println("--- DELUXE ROOM ---");
            System.out.println("Rooms: 106 107 108");
            System.out.println("Features: WiFi, King Bed, Spa, Jacuzzi, 24/7 Service");
            System.out.println("Price: 5000 per day");
        }

        //BOOK ROOM 
        else if (choice == 2) {

            System.out.print("Enter room number: ");
            int num = input.nextInt();
            input.nextLine();
            Room selected = r100;

            if (num == 100) selected = r100;
            else if (num == 101) selected = r101;
            else if (num == 102) selected = r102;
            else if (num == 103) selected = r103;
            else if (num == 104) selected = r104;
            else if (num == 105) selected = r105;
            else if (num == 106) selected = r106;
            else if (num == 107) selected = r107;
            else if (num == 108) selected = r108;
            else {
                System.out.println("Room not found!");
                return;
            }
                // Check if room is already booked
            if (selected.isBooked() == true) {
                System.out.println("This room is already booked!");
                return;
            }

            // customer details
            System.out.print("Enter name: ");
            String name = input.nextLine();

            System.out.print("Enter phone: ");
            String phone = input.nextLine();

            System.out.print("How many days: ");
            int days = input.nextInt();
                // Book the room ( use overloading method)
            selected.bookRoom(name);
                // price calculation
            double total = selected.getPrice() * days;

            //Result
            System.out.println("===== BOOKING SUCCESS =====");
            System.out.println("Name: " + name);
            System.out.println("Phone: " + phone);
            System.out.println("Room: " + selected.getRoomNumber());
            //calling overridden method 
            System.out.println("Features: " + selected.showFeatures());
            System.out.println("Total Price: " + total);
            System.out.println("Thank you for choosing our hotel!");
        }
            // invalid input handling
        else {
            System.out.println("Invalid choice!");
        }
    }
}