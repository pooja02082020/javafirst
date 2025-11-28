package hotelmgmtsystem;

public class DeluxeRoom extends Room {
    public DeluxeRoom(int roomNo) {
        super(roomNo, 120.0);
    }

    @Override
    public void roomInfo() {
        System.out.println("Deluxe Room - Room No: " + roomNo + ", Price: $" + price);
    }
}