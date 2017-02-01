import java.util.Scanner;
import static java.lang.Thread.sleep;

class FQ {
    static void fQ() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Рон: Сыграем еще раз? Да или Нет?");
        Game.game.setAnswer(scan.next());

        while (!Game.game.getAnswer().equalsIgnoreCase("Да") || !Game.game.getAnswer().equalsIgnoreCase("Нет")) {
            if (Game.game.getAnswer().equalsIgnoreCase("Да")) {
                Game.game.setStack(0);
                Game.game.setStackRon(0);
                Coins.c.Bet();
                sleep(1000);
                System.out.println("Рон: Интересная у меня сегодня кампания!");
                sleep(2000);
                System.out.println("Мужчина потирает руки");
                sleep(1500);
                System.out.println("Рон: Берем по карте.");
                Game.game.altStart();
                Game.game.newGame();
                break;
            } else if (Game.game.getAnswer().equalsIgnoreCase("Нет")) {
                sleep(1500);
                System.out.println("Рон: Тогда спасибо за игру! Увидимся");
                System.exit(0);
            } else {
                System.out.println("Напиши еще раз");
                Game.game.setAnswer(scan.next());
            }
        }
    }
}

