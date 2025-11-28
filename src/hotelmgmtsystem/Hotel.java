package hotelmgmtsystem;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms = new ArrayList<>();

    public void addRoom(Room r) {
        rooms.add(r);
    }

    public void showAvailableRooms() {
        System.out.println("----- AVAILABLE ROOMS -----");
        for (Room r : rooms) {
            if (r.isAvailable()) {
                r.roomInfo();
            }
        }
    }

    public Room findRoom(int roomNo) {
        for (Room r : rooms) {
            if (r.getRoomNo() == roomNo) {
                return r;
            }
        }
        return null;
    }
}