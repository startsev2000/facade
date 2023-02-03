package facade;

import software.AccountsService;
import software.RandomizerProgram;
import technics.Computer;

public class UserControlInterfaceImpl implements UserControlInterface {

    private final AccountsService accountsService = new AccountsService();

    private final RandomizerProgram randomizerProgram = new RandomizerProgram();

    private final Computer computer = new Computer(accountsService, randomizerProgram);


    @Override
    public void switchOnComputer() {
        computer.switchOn();
    }

    @Override
    public void switchOffComputer() {
        computer.switchOff();
    }

    @Override
    public void signInUserAccount() {
        computer.signInUserAccountInSystem();
    }

    @Override
    public void runTheRandomizerProgram() {
        computer.runTheRandomizerProgram();
    }

}
