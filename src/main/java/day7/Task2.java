package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100 - 90 + 1) + 90;

        Player player1 = new Player(number);
        Player player2 = new Player(number);
        Player player3 = new Player(number);
        Player player4 = new Player(number);
        Player player5 = new Player(number);
        Player player6 = new Player(number);
        Player player7 = new Player(number);
        Player player8 = new Player(number);

        player1.info();

        for (int a = 0; a < 101; a++) {
            player2.run();
        }

        System.out.println(player2.getCountPlayers());

    }
}

class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    private static int MaxCountPlayers = 6;
    private boolean play;

    Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < MaxCountPlayers) countPlayers++;
        play = true;
    }

    public int getStamina() {
        return stamina;
    }

    public int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina > 0) {
            stamina--;
        } else if (stamina == 0 && play) {
            countPlayers--;
            play = false;
        } else {
        }
    }

    public void info() {
        if (countPlayers == 5) {
            System.out.println("Команды не полные. На поле ещё есть " + (MaxCountPlayers - countPlayers) +
                    " свободное место");
        } else if (countPlayers < 5 && countPlayers > 1) {
            System.out.println("Команды не полные. На поле ещё есть " + (MaxCountPlayers - countPlayers) +
                    " свободных места");
        } else if (countPlayers == 1) {
            System.out.println("Команды не полные. На поле ещё есть " + (MaxCountPlayers - countPlayers) +
                    " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест.");
        }
    }
}