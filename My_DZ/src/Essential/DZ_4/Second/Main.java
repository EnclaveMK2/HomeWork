package Essential.DZ_4.Second;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the command PLAY or RECORD");
        String command = input.next().toLowerCase();

        Player player = new Player(command);

        switch (command){
            case "play":
                player.play();
                player.pause();
                player.stop();
                break;
            case "record":
                player.record();
                player.pause();
                player.stop();
        }
    }
}
