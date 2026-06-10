import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =
                new Scanner(System.in);
        Hotel hotel =
                new Hotel();
        while (true) {
            System.out.println(
                    "\n===== HOTEL RESERVATION SYSTEM =====");
            System.out.println(
                    "1. View Rooms");
            System.out.println(
                    "2. Book Room");
            System.out.println(
                    "3. Cancel Booking");
            System.out.println(
                    "4. View Reservations");
            System.out.println(
                    "5. Exit");
            System.out.print(
                    "Enter Choice: ");
            int choice =
                    sc.nextInt();
            switch (choice) {
                case 1:
                    hotel.showRooms();
                    break;
                case 2:
                    sc.nextLine();
                    System.out.print(
                            "Customer Name: ");
                    String name =
                            sc.nextLine();
                    System.out.print(
                            "Room Number: ");
                    int roomNo =
                            sc.nextInt();
                    hotel.bookRoom(
                            name,
                            roomNo);
                    break;
                case 3:
                    System.out.print(
                            "Room Number: ");
                    int cancelRoom =
                            sc.nextInt();
                    hotel.cancelBooking(
                            cancelRoom);
                    break;
                case 4:
                    hotel.showReservations();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println(
                            "Invalid Choice!");
            }
        }
    }
}