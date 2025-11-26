class ArguementGreaterThanOne extends Exception {
    public ArguementGreaterThanOne(String message) {
        super(message);
    }
}
public class practice {
    public static void main(String[] args) {
        try {
            practice(args);
            System.out.println("Argument is valid.");
        } catch (ArguementGreaterThanOne e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void practice(String[] args) throws ArguementGreaterThanOne {
        if (args.length > 1) {
            throw new ArguementGreaterThanOne("Number of arguments greater than one.");
        }
    }
}