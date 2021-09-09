package homework4.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        System.out.println("\"p\" - play/pause, \"s\" - stop, \"r\" - record, \"q\" - exit");
        System.out.println(player);

        Scanner input = new Scanner(System.in);
        char key = input.next().toLowerCase().charAt(0);


        while (key != 'q') {
            switch (key) {
                case 'p': {
                    if(!player.getState().equals("playing") && !player.getState().equals("recording")) {
                        player.play();
                    } else {
                        player.pause();
                    }
                    break;
                }
                case 's': {
                    if(!player.getState().equals("stopped")) {
                        player.stop();
                    }
                    break;
                }
                case 'r': {
                    if(!player.getState().equals("recording")) {
                        player.record();
                    }
                    break;
                }
            }

            System.out.println(player);
            key = input.next().toLowerCase().charAt(0);
        }

    }
}
