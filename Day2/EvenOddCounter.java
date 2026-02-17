public class EvenOddCounter {
    public static void main(String[] args) {
        // Check if exactly 10 numbers are provided
        if (args.length != 10) {
            System.out.println("Please enter exactly 10 numbers as command-line arguments.");
            return;
        }

        int evenCount = 0;
        int oddCount = 0;
        int[] evenNumbers = new int[10];
        int[] oddNumbers = new int[10];

        for (String arg : args) {
            try {
                // Convert the argument to an integer
                int number = Integer.parseInt(arg);

                // Check if the number is even or odd
                if (number % 2 == 0) {
                    evenNumbers[evenCount++] = number;
                } else {
                    oddNumbers[oddCount++] = number;
                }
            } catch (NumberFormatException e) {
                // Handle invalid inputs
                System.out.println("Invalid input: " + arg + ". Please enter only integers.");
                return;
            }
        }

        // Display results
        System.out.println("Even numbers (" + evenCount + "):");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        System.out.println("\nOdd numbers (" + oddCount + "):");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
    }
}

