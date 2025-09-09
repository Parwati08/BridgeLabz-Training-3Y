class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String movie, int seat, double rate) {
        movieName = movie;
        seatNumber = seat;
        price = rate;
        System.out.println("Ticket booked successfully!");
    }

    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket("Jawan", 12, 250);
        ticket.displayTicket();
    }
}
