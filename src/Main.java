import facade.UserControlInterface;
import facade.UserControlInterfaceImpl;

public class Main {
    public static void main(String[] args) {
        // The facade of computer is user interface
        UserControlInterface userInterface = new UserControlInterfaceImpl();
        userInterface.switchOnComputer();
        userInterface.signInUserAccount();
        userInterface.runTheRandomizerProgram();
        userInterface.switchOffComputer();
    }
}