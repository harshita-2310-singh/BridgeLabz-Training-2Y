class SeatUnavailableException extends Exception {
    public SeatUnavailableException(String message) {
        super(message);
    }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}

class FlightBooking {
    public void checkSeatAvailability() throws SeatUnavailableException {
        boolean seatAvailable = false;
        if (!seatAvailable) {
            throw new SeatUnavailableException("Seat unavailable: please choose another flight.");
        }
    }

    public void processPayment() throws PaymentFailedException {
        boolean paymentSuccess = false;
        if (!paymentSuccess) {
            throw new PaymentFailedException("Payment failed: please check your payment method.");
        }
    }

    public void bookTicket() throws Exception {
        checkSeatAvailability();
        processPayment();
        System.out.println("Flight ticket booked successfully.");
    }
}

public class FlightBookingDemo {
    public static void main(String[] args) {
        FlightBooking booking = new FlightBooking();

        try {
            booking.bookTicket();
        } catch (SeatUnavailableException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Thank you for booking with us!");
        }
    }
}
