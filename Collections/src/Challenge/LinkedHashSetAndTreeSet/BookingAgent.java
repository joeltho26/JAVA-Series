package Challenge.LinkedHashSetAndTreeSet;

public class BookingAgent {
    public static void main(String[] args) {
        int rows = 10;
        int totalSeats = 100;
        Theatre rodgersNYC = new Theatre("Richard Rogers",rows,totalSeats);
        rodgersNYC.printSeatMap();

        bookSeat(rodgersNYC, 'J',5);
        bookSeat(rodgersNYC, 'J',5);

        bookSeat(rodgersNYC, 'B',11);
        bookSeat(rodgersNYC, 'M',1);

        bookSeats(rodgersNYC, 4, 'B', 3, 10);
        bookSeats(rodgersNYC, 6, 'B', 'C', 3, 10);
        bookSeats(rodgersNYC, 4, 'B', 1, 10);
        bookSeats(rodgersNYC, 4, 'B', 'C', 1, 10);
        bookSeats(rodgersNYC, 1, 'B', 'C', 1, 10);
        bookSeats(rodgersNYC, 4, 'M', 'Z', 1, 10);
        bookSeats(rodgersNYC, 10, 'A', 'E', 1, 10);
    }

    private static void bookSeat(Theatre theatre, char row, int seatNo) {
        String seat = theatre.reservedSeat(row,seatNo);
        if (seat != null) {
            System.out.println("Congratulations! you're seat is reserved now! " + seat);
            theatre.printSeatMap();
        } else {
            System.out.println("Sorry! unable ro reserve, try again with another seat number!");
        }
    }

    private static void bookSeats(Theatre theatre, int tickets, char minRow,
                                  int minSeat, int maxSeat ) {

        bookSeats(theatre, tickets, minRow, minRow, minSeat, maxSeat);
    }

    private static void bookSeats(Theatre theatre, int tickets,
                                  char minRow, char maxRow,
                                  int minSeat, int maxSeat) {

        var seats =
                theatre.reservedSeats(tickets, minRow, maxRow, minSeat, maxSeat);
        if (seats != null) {
            System.out.println("Congratulations! Your reserved seats are " + seats);
            theatre.printSeatMap();
        } else {
            System.out.println("Sorry! No matching contiguous seats in rows: "
                    + minRow + " - " + maxRow);
        }
    }
}
