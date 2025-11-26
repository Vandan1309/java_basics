class FinalDemo {

    final int number = 100;

    final void showMessage() {
        System.out.println("This is a final method.");
    }
}
final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

class TestFinal extends FinalDemo {
    // Trying to override final method would cause error
    // void showMessage() { System.out.println("Overridden"); } 
}

public class main {
    public static void main(String[] args) {

                FinalDemo obj = new FinalDemo();
        System.out.println("Final variable value: " + obj.number);

               obj.showMessage();

        FinalClass fc = new FinalClass();
        fc.display();
    }
}