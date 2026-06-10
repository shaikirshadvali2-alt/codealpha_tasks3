import java.util.ArrayList;
public class Hotel {
    private ArrayList<Room> rooms =
            new ArrayList<>();
    private ArrayList<Reservation>
            reservations =
            new ArrayList<>();
    public Hotel() {
        rooms.add(
                new Room(
                        101,
                        "Standard",
                        2000));
        rooms.add(
                new Room(
                        102,
                        "Standard",
                        2000));
        rooms.add(
                new Room(
                        201,
                        "Deluxe",
                        4000));
        rooms.add(
                new Room(
                        301,
                        "Suite",
                        7000));
    }
    public void showRooms() {
        System.out.println(
                "\nAvailable Rooms");
        for (Room room : rooms) {
            System.out.println(room);
        }
    }
    public void bookRoom(
            String customer,
            int roomNo) {
        for (Room room : rooms) {
            if (room.getRoomNumber()
                    == roomNo
                    && room.isAvailable()) {
                System.out.println(
                        "Payment Successful!");
                room.setAvailable(false);
                Reservation reservation =
                        new Reservation(
                                customer,
                                room);
                reservations.add(
                        reservation);
                FileManager.saveBooking(
                        reservation);
                System.out.println(
                        "Room Booked!");
                return;
            }
        }
        System.out.println(
                "Room not available!");
    }
    public void cancelBooking(
            int roomNo) {
        for (Reservation r
                : reservations) {
            if (r.getRoom()
                    .getRoomNumber()
                    == roomNo) {
                r.getRoom()
                        .setAvailable(true);
                reservations.remove(r);
                System.out.println(
                        "Booking Cancelled!");
                return;
            }
        }
        System.out.println(
                "Booking Not Found!");
    }
    public void showReservations() {
        System.out.println(
                "\nReservation Details");
        for (Reservation r
                : reservations) {
            System.out.println(r);
        }
    }
}