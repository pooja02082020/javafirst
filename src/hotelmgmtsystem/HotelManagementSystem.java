package hotelmgmtsystem;


public class HotelManagementSystem {
    public static void main(String[] args) {
        Hotel h = new Hotel();

        h.addRoom(new StandardRoom(101));
        h.addRoom(new DeluxeRoom(201));
        h.addRoom(new SuiteRoom(301));

        h.showAvailableRooms();

        Room selected = h.findRoom(201);
        if (selected != null) {
            selected.bookRoom();
        }

        h.showAvailableRooms();
    }
}
