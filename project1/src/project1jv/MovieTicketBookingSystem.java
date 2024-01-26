package project1jv;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieTicketBookingSystem {
	public static void main(String[] args) {
		System.out.println("                            WELCOME TO IMO CINEMAS");
        BookingSystem bookingSystem = new BookingSystem();
        bookingSystem.addMovie("Hanuman", 10);
        bookingSystem.addMovie("Blue star", 8);
        bookingSystem.addMovie("Mission chapter 1", 24);
        bookingSystem.addMovie("Singapore salon", 6);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Display Movies\n2. Book Ticket\n3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookingSystem.displayMovies();
                    break;
                case 2:
                    System.out.print("Enter the movie name: ");
                    String movieName = scanner.next();
                    System.out.print("Enter the number of tickets: ");
                    int numTickets = scanner.nextInt();
                    bookingSystem.bookTicket(movieName, numTickets);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
	
	class Movie {
	    String name;
	    int availableSeats;

	    Movie(String name, int availableSeats) {
	        this.name = name;
	        this.availableSeats = availableSeats;
	    }
	}

	class BookingSystem {
	    ArrayList<Movie> movies;

	    BookingSystem() {
	        movies = new ArrayList<>();
	    }

	   
	    		void addMovie(String name, int availableSeats) {
	        movies.add(new Movie(name, availableSeats));
	    }

	    void displayMovies() {
	        System.out.println("Movies available:");
	        for (Movie movie : movies) {
	            System.out.println(movie.name + " - Available Seats: " + movie.availableSeats);
	        }
	    }
	    void bookTicket(String movieName, int numTickets) {
	        for (Movie movie : movies) {
	            if (movie.name.equals(movieName)) {
	                if (movie.availableSeats >= numTickets) {
	                    System.out.println("Booking confirmation:");
	                    System.out.println("Movie: " + movie.name);
	                    System.out.println("Available Seats Before Booking: " + movie.availableSeats);
	                    movie.availableSeats -= numTickets;
	                    System.out.println("Number of Seats Booked: " + numTickets);
	                    System.out.println("Available Seats After Booking: " + movie.availableSeats);
	                    System.out.println("Please select payment method (1. Credit Card, 2. PayPal):");
	                    Scanner scanner = new Scanner(System.in);
	                    int paymentMethod = scanner.nextInt();

	                    if (processPayment(paymentMethod)) {
	                        System.out.println("Payment successful! Enjoy the movie.");
	                    } else {
	                        System.out.println("Payment failed. Booking canceled.");
	                        movie.availableSeats += numTickets;  // Refund seats in case of payment failure.
	                    }
	                } else {
	                    System.out.println("Not enough seats available for the selected movie.");
	                }
	                return;
	            }
	        }
	        System.out.println("Movie not found.");
	    }

	    private boolean processPayment(int paymentMethod) {
	    	return true;
	    }
	}



	



