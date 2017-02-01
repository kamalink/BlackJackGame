import java.util.Scanner;
import static java.lang.Thread.sleep;

class wanaPlay {

    static int WanaPlay() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        Coins.c.setPlayerBag(15);
        Coins.c.setRonBag(100);
        {
            System.out.println("\n" + "Рон: " + Game.game.getName() + "? Какое красивое имя!");
            sleep(2000);
            System.out.println("Рон: Так вот, " + Game.game.getName() + "," + " не хочешь ли ты сыграть со мной в Блек Джек?");
            sleep(1500);
            System.out.println("Рон: На звонкие монеты! А?");
            sleep(2500);
            System.out.println("Рон: Если я проиграю отдам тебе свои, а если ты проиграешь - отдашь мне.");
            sleep(3000);
            System.out.println("Рон: Идет?");
            sleep(3000);
            Coins.c.balance();
            sleep(2500);
            System.out.print("Рон: Ты, кстати, правила знаешь? Если хочешь могу объяснить, это быстро.");
            sleep(2500);
            System.out.println(" Просто напиши Давай или НеНадо.");
            Game.game.setAnswer(scan.next());
        }


        while (!Game.game.getAnswer().equals("Давай")||!Game.game.getAnswer().equals("НеНадо")) {
            if (Game.game.getAnswer().equals("Давай")) {
                sleep(1500);
                Game.game.rules();
                sleep(2000);
                System.out.println("Рон: Начнем?");
                break;
            } else if(Game.game.getAnswer().equals("НеНадо")) {
                sleep(1500);
                System.out.println("Рон: Хорошо, начнем?");
                sleep(1500);
                break;
            } else {
                System.out.println("Напиши еще раз");
                Game.game.setAnswer(scan.next());
            }
        }

        {
            sleep(1000);
            Coins.c.Bet();
            sleep(1500);
            System.out.println("Мужчина достает из сумки колоду и ложит на стол.");
            sleep(3000);
            System.out.println("Рон: Ты берешь первый.");
            sleep(2500);
            System.out.print("Рон: Ну же, бери карту.");
            sleep(1500);
            System.out.println(" Неможешь?");
            sleep(2000);
            System.out.println("Рон: Ладно, тогда напиши \"О великий, преподнеси мне, пожалуйста карту!\"");
            sleep(6000);
            System.out.println("Рон: Да не смотри ты на меня так, я же просто пошутил.");
            sleep(1200);
            System.out.println("\"Давиться смехом\"");
            sleep(3000);
            System.out.print("Рон: Ох уж эти путники. Кто откуда, а шуток не понимают.");
            sleep(1500);
            System.out.println(" Просто напиши \"ДайКарту\".");
        }

        while (!Game.game.getAnswer().equals("ДайКарту")) {
            Game.game.setAnswer(scan.next());
            if (Game.game.getAnswer().equals("ДайКарту")) {
                sleep(1000);
                System.out.println("\n" + "Рон: Держи!");
                Game.game.setStack(Game.game.newCard());
                sleep(2000);
                System.out.print("Мужчина передает вам карту.");
                sleep(3000);
                System.out.println(" Вы берете ее в руку и переворачиваете.");
                Game.game.setStackRon(Game.game.newCard());
                sleep(2000);
                System.out.println(Game.game.getStack());
                break;
            } else {
                sleep(1000);
                System.out.println("\n" + "Рон: Что? Что ты написал?");
                sleep(2000);
                System.out.println("Рон: Я не могу разобрать что это, но точно не ДайКарту.");
                sleep(1000);
                System.out.println("Напиши еще раз.");
            }
        }
        return 0;
    }
}




