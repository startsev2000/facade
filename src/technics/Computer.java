package technics;

import software.AccountsService;
import software.RandomizerProgram;

public class Computer {

    private final AccountsService accountsService;


    private final RandomizerProgram randomizerProgram;

    public Computer(AccountsService accountsService, RandomizerProgram randomizerProgram) {
        this.accountsService = accountsService;
        this.randomizerProgram = randomizerProgram;
    }

    public void switchOn() {
        System.out.println("Launch the computer..");
        try {
            for (int i = 0; i < 15; i++) {
                System.out.print("▋");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Something went wrong. Please, try again");
            e.printStackTrace();
        }
        System.out.println("\nThe computer is launched");
    }

    public void signInUserAccountInSystem() {
        accountsService.signInUserAccountInSystem();
    }


    public void switchOff() {
        System.out.println("Switch off the computer. Saving the data..");
        try {
            for (int i = 0; i < 15; i++) {
                System.out.print("▋");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Something went wrong. Please, try again");
            e.printStackTrace();
        }
        System.out.println("\nThe computer is switched off");
    }

    public void runTheRandomizerProgram() {
        randomizerProgram.execute();
    }
}
