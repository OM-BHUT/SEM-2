import java.util.*;

public class Q2gpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        try {
            for(int i = 1; i <= n; i++) {
                System.out.println("Enter your integer number " + i + ":");
                int number = sc.nextInt();
                
                if (number < 0) {
                    throw new NegativeNumberException("Number is negative: " + number);
                } else if (number % 10 == 0) {
                    throw new EvenlyDivisibleException("Number is evenly divisible by 10: " + number);
                } else if (number > 1000 && number < 2000) {
                    throw new NumberInRange("Number is in range: " + number);
                } else if (number > 7000) {
                    throw new NumberOutOfRange("Number is out of range: " + number);
                }
                
                sum += number;
            }
            System.out.println("Sum is " + sum);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage() + " Skipping.");
        } catch (EvenlyDivisibleException e) {
            System.out.println(e.getMessage() + " Skipping.");
        } catch (NumberInRange e) {
            System.out.println(e.getMessage() + " Skipping.");
        } catch (NumberOutOfRange e) {
            System.out.println(e.getMessage() + " Skipping.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer. Skipping.");
            sc.next(); // To clear the invalid input from scanner
        }
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class EvenlyDivisibleException extends Exception {
    public EvenlyDivisibleException(String message) {
        super(message);
    }
}

class NumberInRange extends Exception {
    public NumberInRange(String message) {
        super(message);
    }
}

class NumberOutOfRange extends Exception {
    public NumberOutOfRange(String message) {
        super(message);
    }
}
