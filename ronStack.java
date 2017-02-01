import java.util.Random;
import static java.lang.Thread.sleep;

class ronStack {
    static int RonStack() throws InterruptedException {
        Random rand = new Random();

        if (Game.game.getStackRon() < 15) {
            Game.game.setStackRon(Game.game.stackRon += Game.game.newCard());
            Game.game.burnOut();
            return 0;
        } else if (Game.game.getStackRon() >= 15 && Game.game.getStackRon() <= 17) {
            System.out.println("Рон: Опасно, опасно. Дай подумать.");
            sleep(6000);
            int a = 3 - rand.nextInt(2);
            if (a == 2) {
                System.out.print("Рон: Нет, я пас! Давай раскрывать карты.");
                sleep(3000);
                System.out.println(" У меня " + Game.game.getStackRon() + ". У тебя " + Game.game.getStack());
                sleep(1000);
                Coins.c.draw();
                Coins.c.whoWinn();
                sleep(1500);
                FQ.fQ();
            } else if (a == 3) {
                System.out.println("Рон: Попробую рискнуть.");
                sleep(2000);
                Game.game.setStackRon(Game.game.stackRon += Game.game.newCard());
                Game.game.burnOut();
            }
        } else if (Game.game.getStackRon() >= 18){
            System.out.println("Рон: Опасно, опасно. Дай подумать.");
            sleep(6000);
            int a = 4 - rand.nextInt(3);
            if (a==2||a==3) {
                    System.out.println("Рон: Нет, я пас! Давай раскрывать карты.");
                    sleep(3000);
                    System.out.println(" У меня " + Game.game.getStackRon() + ". У тебя " + Game.game.getStack());
                    Coins.c.draw();
                    Coins.c.whoWinn();
                    sleep(1500);
                    FQ.fQ();
                } else if (a==4) {
                    System.out.println("Рон: Попробую рискнуть.");
                    sleep(2000);
                    Game.game.setStackRon(Game.game.stackRon+=Game.game.newCard());
                    Game.game.burnOut();
                }
            }
        return 0;
    }
}
