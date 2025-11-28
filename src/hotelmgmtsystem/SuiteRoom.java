package hotelmgmtsystem;

public class SuiteRoom extends Room {
    public SuiteRoom(int roomNo) {
        super(roomNo, 200.0);
    }

    @Override
    public void roomInfo() {
        System.out.println("Suite Room - Room No: " + roomNo + ", Price: $" + price);
    }
}