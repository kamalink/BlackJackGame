import java.util.Scanner;
import static java.lang.Thread.sleep;

class Coins {
    Scanner scan = new Scanner(System.in);
    private int playerBag;
    private int ronBag;
    private int bet;
    static Coins c = new Coins();

    void balance() {
        System.out.println("У вас " + getPlayerBag() + " монет." + "\n" + "У Рона " + getRonBag() + " монет.");
    }

    void Bet() throws InterruptedException {
        sleep(1500);
        System.out.println("Рон: Какая ставка?");
        setBet(scan.nextInt());

        if (getPlayerBag() < getBet()) {
            sleep(1500);
            System.out.println("Рон: У тебя пока нет таких денег. Ты же не хочешь влезать в долг, верно?");
            c.lack();
        } else if (getRonBag() < getBet()) {
            sleep(1500);
            System.out.println("Рон: Эй, у меня нет столько!");
            c.lack();
        } else {
            sleep(1500);
            System.out.println("Рон: Тогда начнем.");
            setPlayerBag(getPlayerBag()-getBet());
            setRonBag(getRonBag()-getBet());
        }
    }

    private void lack() throws InterruptedException {
        while (getPlayerBag() < getBet() || getRonBag() < getBet()) {
            sleep(1500);
            System.out.println("Рон: Давай другую ставку");
            Coins.c.balance();
            setBet(scan.nextInt());
        }
        setPlayerBag(getPlayerBag()-getBet());
        setRonBag(getRonBag()-getBet());
    }

    void whoWinn() throws InterruptedException {
        if(getPlayerBag()==0){
            sleep(1500);
            System.out.println("Рон: Сожалею, но мне пора. Все хорошего!");
            System.exit(0);
        } else if(getRonBag()==0){
            sleep(2000);
            System.out.println("Рон: Хм. Я вот что тебе скажу:");
            sleep(2500);
            System.out.println("Мужчина встает из-за стола, одной рукой потянувшись к топору на поясе");
            sleep(2500);
            System.out.println("Рон: Убирайся отсюда.");
            sleep(1500);
            System.out.println("Рон: Пока я не передумал.");
            System.exit(0);
        }
    }

    void priseForPlayer(){
        setPlayerBag(getPlayerBag() + (getBet()*2));
        balance();
    }

    void priseForRon(){
        setRonBag(getRonBag() + (getBet()*2));
        balance();
    }

    void draw(){
        if(Game.game.getStack()>Game.game.getStackRon()){
            Coins.c.priseForPlayer();
        } else if(Game.game.getStack()<Game.game.getStackRon()){
            Coins.c.priseForRon();
        } else if(Game.game.getStack()==Game.game.getStackRon()){
            System.out.println("Рон: Похоже ничья!");
            Game.game.setStack(Game.game.getStack()+Coins.c.getBet());
            Game.game.setStackRon(Game.game.getStackRon()+Coins.c.getBet());
            balance();
        }
    }

    private int getPlayerBag() {
        return playerBag;
    }

    void setPlayerBag(int playerBag) {
        this.playerBag = playerBag;
    }

    private int getRonBag() {
        return ronBag;
    }

    void setRonBag(int ronBag) {
        this.ronBag = ronBag;
    }

    private int getBet() {
        return bet;
    }

    private void setBet(int bet) {
        this.bet = bet;
    }
}

