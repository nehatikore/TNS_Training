import java.util.Scanner;

class TicketBooking {
    // Private attributes
    private String customerName;
    private int ticketCount;
    private double ticketPrice;
    private double totalAmount;

    // Constructor
    public TicketBooking(String customerName, int ticketCount, double ticketPrice) {
        this.customerName = customerName;
        this.ticketCount = ticketCount;
        this.ticketPrice = ticketPrice;
        this.totalAmount = ticketCount * ticketPrice;
    }

    // Method Overloading for payment methods
    public void pay(double cash) {
        System.out.println("Payment Mode: Cash");
        System.out.println("Amount Paid: ?" + cash);
    }

    public void pay(String walletName, double amount) {
        System.out.println("Payment Mode: Online Wallet - " + walletName);
        System.out.println("Amount Paid: ?" + amount);
    }

    public void pay(String cardNumber, String holderName, String expiry, double amount) {
        System.out.println("Payment Mode: Credit Card");
        System.out.println("Card Holder: " + holderName);
        System.out.println("Card Number: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Expiry: " + expiry);
        System.out.println("Amount Paid: ?" + amount);
    }

    // Print Receipt
    public void printReceipt() {
        System.out.println("\n------ TICKET RECEIPT ------");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Tickets Booked: " + ticketCount);
        System.out.println("Price per Ticket: ?" + ticketPrice);
        System.out.println("Total Amount: ?" + totalAmount);
        System.out.println("-----------------------------");
    }

    // Getter for total amount
    public double getTotalAmount() {
        return totalAmount;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Stage Show Ticket Booking ===");

        // Input customer and ticket info
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of tickets: ");
        int count = sc.nextInt();

        System.out.print("Enter price per ticket: ?");
        double price = sc.nextDouble();

        TicketBooking booking = new TicketBooking(name, count, price);
        double total = booking.getTotalAmount();

        // Choose payment method
        System.out.println("\nSelect Payment Method:");
        System.out.println("1. Cash");
        System.out.println("2. Online Wallet");
        System.out.println("3. Credit Card");
        System.out.print("Your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println();

        switch (choice) {
            case 1:
                System.out.print("Enter cash amount: ?");
                double cash = sc.nextDouble();
                booking.pay(cash);
                break;

            case 2:
                System.out.print("Enter wallet name (e.g., Paytm, GPay): ");
                String wallet = sc.nextLine();
                booking.pay(wallet, total);
                break;

            case 3:
                System.out.print("Enter card number (16 digits): ");
                String card = sc.nextLine();
                System.out.print("Enter cardholder name: ");
                String holder = sc.nextLine();
                System.out.print("Enter expiry date (MM/YY): ");
                String expiry = sc.nextLine();
                booking.pay(card, holder, expiry, total);
                break;

            default:
                System.out.println("Invalid choice.");
                return;
        }

        // Print the receipt
        booking.printReceipt();
    }
}
