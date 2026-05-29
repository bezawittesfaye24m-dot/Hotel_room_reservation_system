     // Child class ( Inherit from Room class)
class DeluxeRoom extends Room {

    // Constructor( use 'super' to call parent class constructor)
    public DeluxeRoom(int roomNumber) {
        super(roomNumber, 5000);
    }

    //Override ( change the behaviour of the parent class)
    public String showFeatures() {
        return "High-Speed WiFi, Smart TV, King Bed, City View, Jacuzzi, Spa Access, 24/7 Service";
    }
    //reuse parent method (use parent class bookroom() method with out changing it )
    public void bookRoom() {
        super.bookRoom();
    }
}
