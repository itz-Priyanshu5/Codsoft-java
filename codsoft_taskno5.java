import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] currencies = {"INR", "USD", "EUR", "JPY"};
        double[][] rates = {
            // To: INR,   USD,   EUR,   JPY
            {1.0,   0.012, 0.011, 1.75},  // From INR
            {83.0,  1.0,   0.92,  145.0}, // From USD
            {90.0,  1.08,  1.0,   157.0}, // From EUR
            {0.57,  0.0069, 0.0064, 1.0}  // From JPY
        };

        System.out.println("Available currencies:");
        for (int i = 0; i < currencies.length; i++) {
            System.out.println(i + ". " + currencies[i]);
        }

        System.out.print("Enter base currency number: ");
        int from = scanner.nextInt();

        System.out.print("Enter target currency number: ");
        int to = scanner.nextInt();

        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        double converted = amount * rates[from][to];
        System.out.printf("%.2f %s = %.2f %s\n",
                amount, currencies[from], converted, currencies[to]);

        scanner.close();
    }
}
