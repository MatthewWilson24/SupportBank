package training.supportbank;


import java.io.IOException;
import java.util.scanner;

public class Main {
    public static void main(String args[]) throws IOException {

        // Program runs until QUIT command given
        while (true) {
            Scanner scanner = new Scanner(System.in);

            // Reads and matches command
            if (scanner.hasNextLine()) {
                String input = scanner.nextLine().toUpperCase();
                String[] cmd = input.split(" ");

                if (cmd[0].equals("IMPORT") && cmd.length == 2) {

                }
                else if (cmd[0].equals("LIST") && cmd[1].equals("ALL") && cmd.length == 2) {

                }
                else if (cmd[0].equals("LIST") && cmd.length == 3) {

                }
                else if (cmd[0].equals("QUIT") && cmd.length == 1) {
                    break;
                }
                else {
                    System.out.println("Invalid command");
                }
            }
        }
    }
}
