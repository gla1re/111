public class Main {

    public static void main(String[] args) {

        Guest guest1 = new Guest("Samat", "87757747026");
        Guest guest2 = new Guest("Bolat", "87777777777");

        Room room1 = new Room(101, "Single", 80.0);
        Room room2 = new Room(102, "Double", 120.0);

        Booking booking1 = new Booking(guest1, room1, 3);
        Booking booking2 = new Booking(guest2, room2, 2);

        System.out.println("=== Booking 1 ===");
        booking1.displayBooking();

        System.out.println("\n=== Booking 2 ===");
        booking2.displayBooking();

        if (booking1.calculateTotalPrice() > booking2.calculateTotalPrice()) {
            System.out.println("\nBooking 1 is more expensive.");
        } else if (booking1.calculateTotalPrice() < booking2.calculateTotalPrice()) {
            System.out.println("\nBooking 2 is more expensive.");
        } else {
            System.out.println("\nBoth bookings cost the same.");
        }
    }
}
