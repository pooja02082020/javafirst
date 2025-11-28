package hotelmgmtsystem;

public class StandardRoom extends Room {
    public StandardRoom(int roomNo) {
        super(roomNo, 80.0);
    }

    @Override
    public void roomInfo() {
        System.out.println("Standard Room - Room No: " + roomNo + ", Price: $" + price);
    }
}
