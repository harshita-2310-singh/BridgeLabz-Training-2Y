package constructorslevel1;

public class HotelBooking {
		    String guestName;
		    String roomType;
		    int nights;

		    HotelBooking() {
		        guestName = "Unknown";
		        roomType = "Standard";
		        nights = 1;
		    }

		    HotelBooking(String guestName, String roomType, int nights) {
		        this.guestName = guestName;
		        this.roomType = roomType;
		        this.nights = nights;
		    }

		    HotelBooking(HotelBooking booking) {
		        this.guestName = booking.guestName;
		        this.roomType = booking.roomType;
		        this.nights = booking.nights;
		    }

		    void display() {
		        System.out.println("Guest Name: " + guestName);
		        System.out.println("Room Type: " + roomType);
		        System.out.println("Nights: " + nights);
		        System.out.println();
		    }

		    public static void main(String[] args) {
		        HotelBooking b1 = new HotelBooking();
		        b1.display();

		        HotelBooking b2 = new HotelBooking("John Doe", "Deluxe", 3);
		        b2.display();

		        HotelBooking b3 = new HotelBooking(b2);
		        b3.display();
		    }
		}
