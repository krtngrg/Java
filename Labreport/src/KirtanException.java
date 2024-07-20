class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message); // Call superclass constructor with message
    }
}


public class KirtanException {
    public static void ageVerify(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Underage detected");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        try {
            ageVerify(17);
        } catch (InvalidAgeException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}