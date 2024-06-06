public class PowerCalculator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Exactly two arguments are required.");
            return;
        }

        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            if (x < 0 || y < 0) {
                throw new IllegalArgumentException("Both x and y must be non-negative integers.");
            }

            long result = 1;
            for (int i = 0; i < y; i++) {
                result *= x;
            }
            System.out.println(x + "^" + y + " = " + result);
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Both x and y must be integers.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
