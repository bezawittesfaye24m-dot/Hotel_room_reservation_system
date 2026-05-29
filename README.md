🏨 Hotel Room Reservation System - Java OOP Project
📌 Project Overview

This is a console-based Hotel Room Reservation System built using Java.

It demonstrates core Object-Oriented Programming (OOP) concepts:

Encapsulation
Inheritance
Polymorphism
Abstraction

The system allows users to:

View room types
Book rooms
Enter customer details
Calculate total price
▶️ How to Run
Compile:
javac Main.java Room.java OneBedRoom.java TwoBedRoom.java DeluxeRoom.java
Run:
java Main
🧱 1. Classes (OOP Structure)

📁 Files:

Room.java
OneBedRoom.java
TwoBedRoom.java
DeluxeRoom.java
Classes:
class Room
class OneBedRoom
class TwoBedRoom
class DeluxeRoom

✔ Location:
All classes → Line 1 in each file

🧱 2. Objects (Object Creation)

📁 File: Main.java

Objects are created from classes to represent real hotel rooms.

Room r100 = new OneBedRoom(100);
Room r101 = new OneBedRoom(101);

Room r103 = new TwoBedRoom(103);
Room r104 = new TwoBedRoom(104);

Room r106 = new DeluxeRoom(106);
Room r107 = new DeluxeRoom(107);
✔ Location:
Lines 12–22

🔒 2. Encapsulation

📁 File: Room.java

private int roomNumber;   // Line 4
private double price;     // Line 5
private boolean booked;   // Line 6

✔ Demonstrates data hiding

🧱 3. Constructor

📁 File: Room.java

public Room(int roomNumber, double price)

✔ Location:
Room.java → Lines 9–13
🔑 4. Getters & Setters

📁 File: Room.java

Getters:
getRoomNumber()   // Line 16–18
getPrice()        // Line 20–22
isBooked()        // Line 24–26
Setters:
setRoomNumber()   // Line 28–30
setPrice()        // Line 32–34
setBooked()       // Line 36–38
🧬 5. Inheritance

📁 Files:

OneBedRoom.java
TwoBedRoom.java
DeluxeRoom.java
class OneBedRoom extends Room   // Line 2
class TwoBedRoom extends Room   // Line 2
class DeluxeRoom extends Room   // Line 2

✔ Shows child-parent relationship

🔄 6. Polymorphism
✔ Method Overriding (Runtime Polymorphism)

📁 Files:

OneBedRoom.java → Lines 10–12
TwoBedRoom.java → Lines 10–12
DeluxeRoom.java → Lines 10–12
public String showFeatures()

✔ Each room type has different features

✔ Method Overloading (Compile-time Polymorphism)

📁 File: Room.java

bookRoom()
bookRoom(String customerName)

✔ Location:

Room.java → Lines 40–49
✔ Runtime Polymorphism Example

📁 File: Main.java

Room selected = r100;

✔ Location:

Main.java → Line 58
🎮 7. User Input (Scanner)

📁 File: Main.java

Used for:

Room number → Line 55
Name → Line 82
Phone → Line 85
Days → Line 88
💡 8. Abstraction

📁 File: Main.java

Users only interact with:

Menu (Line 25–28)
Booking system

Internal logic is hidden inside classes.

📊 9. Booking Logic Flow (Main.java)

✔ Room selection:

Lines 58–72

✔ Booking check:

Lines 74–78

✔ Booking action:

Line 91

✔ Output result:

Lines 97–105
📌 Conclusion

This project demonstrates key OOP concepts in Java:
✔ Classes and Objects
✔ Encapsulation (Room.java Lines 4–6)
✔ Inheritance (Line 2 in child classes)
✔ Polymorphism (showFeatures + bookRoom overload)
✔ Abstraction (Main.java menu system)



