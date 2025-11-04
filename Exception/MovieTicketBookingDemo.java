import java.util.*;

class InvalidSeatException extends Exception {
    public InvalidSeatException(String message) {
        super(message);
    }
}

class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}

class MovieTheatre {
    private Map<Integer, Boolean> seats = new HashMap<>();

    public MovieTheatre(int totalSeats) {
        for (int i = 1; i <= totalSeats; i++) {
            seats.put(i, false);
        }
    }

    public void bookSeat(int seatNumber) throws InvalidSeatException, SeatAlreadyBookedException {
        if (!seats.containsKey(seatNumber)) {
            throw new InvalidSeatException("Booking failed: seat number " + seatNumber + " does not exist.");
        }

        if (seats.get(seatNumber)) {
            throw new SeatAlreadyBookedException("Booking failed: seat number " + seatNumber + " is already booked.");
        }

        seats.put(seatNumber, true);
        System.out.println("Seat number " + seatNumber + " booked successfully.");
    }
}

public class MovieTicketBookingDemo {
    public static void main(String[] args) {
        MovieTheatre theatre = new MovieTheatre(10);

        try {
            theatre.bookSeat(5);
            theatre.bookSeat(5);
        } catch (InvalidSeatException e) {
            System.out.println(e.getMessage());
        } catch (SeatAlreadyBookedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Booking process completed.");
        }
    }
}
