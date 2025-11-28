package hotelmgmtsystem;

abstract public class Room implements Bookable {
    protected int roomNo;
    protected double price;
    protected boolean isAvailable = true;

    public Room(int roomNo, double price) {
        this.roomNo = roomNo;
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public abstract void roomInfo();

    @Override
    public void bookRoom() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Room " + roomNo + " booked successfully!");
        } else {
            System.out.println("Room " + roomNo + " is already booked.");
        }
    }

    @Override
    public void checkOut() {
        isAvailable = true;
        System.out.println("Room " + roomNo + " is now available again.");
    }
}
