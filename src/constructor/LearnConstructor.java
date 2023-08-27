package constructor;

public class LearnConstructor {
    // Instance variables
    private String message;

    // Default constructor
    public LearnConstructor() {
        message = "This is the default constructor.";
    }

    // Parameterized constructor
    public LearnConstructor(String customMessage) {
        message = customMessage;
    }

    // Method to display the message
    public void displayMessage() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        // Creating objects using constructors
        LearnConstructor defaultConstructorObj = new LearnConstructor(); // Calls the default constructor
        LearnConstructor paramConstructorObj = new LearnConstructor("Custom message"); // Calls the parameterized constructor

        // Displaying messages
        System.out.println("Default Constructor Message:");
        defaultConstructorObj.displayMessage();

        System.out.println("\nParameterized Constructor Message:");
        paramConstructorObj.displayMessage();
    }
}
