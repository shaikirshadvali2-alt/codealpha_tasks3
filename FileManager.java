import java.io.FileWriter;
import java.io.IOException;
public class FileManager {
    public static void saveBooking(
            Reservation reservation) {
        try {
            FileWriter fw =
                    new FileWriter(
                            "bookings.txt",
                            true);
            fw.write(
                    reservation.toString()
                            + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println(
                    "Error saving booking.");
        }
    }
}