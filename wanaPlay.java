import java.util.Scanner;
import static java.lang.Thread.sleep;

class wanaPlay {

    static void WanaPlay() throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        wanaPlay fail = new wanaPlay();

        Coins.c.setPlayerBag(15);
        Coins.c.setRonBag(100);


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
        System.out.println("Рон: Ты, кстати, правила знаешь?");
        sleep(1500);
        System.out.print("Рон: Если хочешь чтобы я рассказал - напиши что-нибудь.");
        sleep(2500);
        System.out.println(" А если НЕ хочешь, просто напиши \"нет\".");

        Game.game.setAnswer(scan.next());

        switch (Game.game.getAnswer()) {
            case "нет":
                sleep(1500);
                System.out.println("Рон: Хорошо, начнем?");
                sleep(1500);
                break;
            default:
                sleep(1500);
                Game.game.rules();
                sleep(2000);
                System.out.println("Начнем?");
                break;
        }


        sleep(1000);
        Coins.c.Bet();
        sleep(2000);
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
        System.out.println("Давиться смехом");
        sleep(3000);
        System.out.println("Рон: Ох уж эти путники. Кто откуда, а шуток не понимают.");
        sleep(1500);
        System.out.println("Рон: Так что, давать карту?");
        sleep(2000);
        System.out.println("Мужчина смотрит на вас.");
        sleep(2000);
        System.out.println("Рон: или \"подождем\"?");
        Game.game.setAnswer(scan.next());

        if (Game.game.getAnswer().equalsIgnoreCase("подождем")) {
            sleep(1200);
            System.out.println("Человек улыбнулся.");
            sleep(1300);
            System.out.println("Рон: Прости, старик, не выйдет.");
            sleep(1500);
            fail.give();
        } else {
            sleep(1500);
            fail.give();
        }

    }

    private void give() throws InterruptedException {
        System.out.println("Мужчина передает вам карту.");
        sleep(1500);
        System.out.println("\n" + "Рон: Держи!");
        Game.game.setStack(Game.game.newCard());
        sleep(3000);
        System.out.println("Вы берете ее в руку и переворачиваете.");
        Game.game.setStackRon(Game.game.newCard());
        sleep(2000);
        System.out.println(Game.game.getStack());
    }
}





