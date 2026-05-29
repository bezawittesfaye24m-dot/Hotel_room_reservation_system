  // Child class ( Inherit from Room class)
class TwoBedRoom extends Room {

    // Constructor( use 'super' to call parent class constructor)
    public TwoBedRoom(int roomNumber) {
        super(roomNumber, 3000);
    }

    //Override( change the behaviour of the parent class)
    public String showFeatures() {
        return "WiFi, Smart TV, Two Beds, AC, Balcony, Coffee Machine, Free Breakfast";
    }
    //reuse parent method (use parent class bookroom() method with out changing it )
    public void bookRoom() {
        super.bookRoom();
    }
}
