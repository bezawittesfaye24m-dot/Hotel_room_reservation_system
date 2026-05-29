// Child class ( Inherit from Room class)
class OneBedRoom extends Room {

    // Constructor ( use 'super' to call parent class constructor)
    public OneBedRoom(int roomNumber) {
        super(roomNumber, 2000);
    }

    //Override ( change the behaviour of the parent class)
    public String showFeatures() {
        return "WiFi, Smart TV, Room Service, Free Breakfast, Single Bed, AC";
    }
      //reuse parent method (use parent class bookroom() method with out changing it )
    public void bookRoom() {
        super.bookRoom();
    }
}
