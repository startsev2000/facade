package software;

import java.util.Random;
import java.util.Scanner;

public class RandomizerProgram {

    private final Scanner in = new Scanner(System.in);
    private final FilePrinter filePrinter = new FilePrinter();

    public void execute() {
        System.out.println("Hello, it's randomizer program. To get the random count, enter start of interval:");
        try {
            String start = "";
            int startInterval = Integer.MIN_VALUE;
            boolean isValid = false;
            while (!isValid) {
                start = in.nextLine();
                try {
                    startInterval = Integer.parseInt(start);
                    isValid = true;
                } catch (NumberFormatException e) {
                    System.out.println("Please, print the correct count");
                }
            }
            System.out.println("Now enter end of interval:");
            String end = "";
            int endInterval = Integer.MAX_VALUE;
            isValid = false;
            while (!isValid) {
                end = in.nextLine();
                try {
                    endInterval = Integer.parseInt(end);
                    if (endInterval < startInterval) {
                        System.out.println("The end must be large than start");
                    } else isValid = true;
                } catch (NumberFormatException e) {
                    System.out.println("Please, print the correct count");
                }
            }
            int randomValue = getRandomNumber(startInterval, endInterval);
            System.out.println("Generated value: " + randomValue);
            System.out.println("Do you want to save this value in file?");
            String answer = "";
            while (answer.equals("")) {
                answer = in.nextLine();
                if (!answer.equals("yes") && !answer.equals("no")) {
                    answer = "";
                    System.out.println("Please, print yes or no");
                }
            }
            if (answer.equals("yes")) {
                System.out.println("Please, enter the file name");
                String fileName = "";
                while (fileName.equals("")) {
                    fileName = in.nextLine();
                }
                filePrinter.writeIntoFile(fileName, randomValue + "");
            }
            System.out.println("The ending of randomizer program");
        } catch (Exception e) {
            System.out.println("Something went wrong. Please, try again");
            e.printStackTrace();
        }
    }

    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
