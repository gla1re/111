public class Booking {

    private Guest guest;
    private Room room;
    private int nights;

    public Booking(Guest guest, Room room, int nights) {
        this.guest = guest;
        this.room = room;
        this.nights = nights;
    }

    public double calculateTotalPrice() {
        return nights * room.getPricePerNight();
    }

    public void displayBooking() {
        guest.displayGuest();
        room.displayRoom();
        System.out.println("Nights: " + nights);
        System.out.println("Total price: $" + calculateTotalPrice());
    }
}
