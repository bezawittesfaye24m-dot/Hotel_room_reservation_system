 public class Room {

     // Encapsulation ( to protect data )
    private int roomNumber;
    private double price;
    private boolean booked;

    // Constructor( to initialize the object value when we create a room )
    public Room(int roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.booked = false;
    }

    // Getters and Setters ( to access private variables from outside class)
    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBooked() {
        return booked;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setBooked(boolean booked) {
        this.booked = booked;
    }
     // Method to book the room

    
    public void bookRoom() {
        booked = true;
    }
      // Method overload ( used when customer name is given)
    public void bookRoom(String customerName) {
    booked = true;
    System.out.println("Booked for: " + customerName);
}
    //  polymorphic Method override ( method will be changed in child class)
    public String showFeatures() {
        return "Basic Room";
    }
}
