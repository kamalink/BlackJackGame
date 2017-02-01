import java.util.Scanner;
import static java.lang.Thread.sleep;

class moreOrNot {
    static int MoreOrNot() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        sleep(3000);
        System.out.println("Рон: Еще возьмешь или тебе хватит? Напиши Еще или Хватит.");
        Game.game.setAnswer(scan.next());

        while (!Game.game.getAnswer().equals("Еще") || !Game.game.getAnswer().equals("Хватит")) {
            if (Game.game.getAnswer().equals("Еще")) {
                    sleep(1500);
                    System.out.println("Рон: Хорошо, я тоже беру.");
                    int through = Game.game.newCard();
                    Game.game.setStack(Game.game.stack += through);
                    sleep(2000);
                    System.out.println("Вы берете еще одну карту из колоды. Это ");
                    sleep(1000);
                    System.out.println(".");
                    sleep(1000);
                    System.out.println(".");
                    sleep(1000);
                    System.out.println(".");
                    sleep(1500);
                    System.out.println(through);

                    if (Game.game.getStack() > 21) {
                        System.out.println("Рон: Ха! Смотри-ка, у тебя " + Game.game.getStack() + ". Это перебор! Я выиграл! Если что, у меня было " + Game.game.getStackRon());
                        Coins.c.priseForRon();
                        Coins.c.whoWinn();
                        FQ.fQ();
                    } else {
                        System.out.println("Сейчас у вас " + Game.game.getStack() + ".");
                        return 0;
                    }
                break;
            } else if (Game.game.getAnswer().equals("Хватит")) {
                sleep(1500);
                System.out.println("Рон: Ладно, тогда раскрываем карты.");
                sleep(3000);
                System.out.println("Рон: У меня " + Game.game.getStackRon() + ". У тебя " + Game.game.getStack());
                Coins.c.draw();
                Coins.c.whoWinn();
                sleep(1500);
                FQ.fQ();
                break;
            } else {
                System.out.println("Напиши еще раз");
                Game.game.setAnswer(scan.next());
            }
        }
        return 0;
    }
}
