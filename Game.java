import java.util.Random;
import static java.lang.Thread.sleep;

class Game {
    int stack;
    int stackRon;
    private String answer;
    private String name;
    static Game game=new Game();

    public static void main(String[] args) throws InterruptedException {
        Introduce.introduce();
        wanaPlay.WanaPlay();
        moreOrNot.MoreOrNot();
        ronStack.RonStack();
        game.newGame();
        FQ.fQ();

    }
    void newGame() throws InterruptedException {
        int a=0;
        while(a<1) {
           moreOrNot.MoreOrNot();
           ronStack.RonStack();
       }
    }
    void altStart() throws InterruptedException {
        setStack(newCard());
        setStackRon(newCard());
        sleep(2000);
        System.out.println("Вы берете карту. Это ");
        sleep(1000);
        System.out.println(".");
        sleep(1000);
        System.out.println(".");
        sleep(1000);
        System.out.println(".");
        sleep(1500);
        System.out.println(getStack());
    }
    void burnOut() throws InterruptedException {
        if(getStackRon()>21){
            sleep(1500);
            System.out.println("\n" + "Рон: Эх, у меня перебор. Ты везучий однако!");
            sleep(1500);
            Coins.c.priseForPlayer();
            Coins.c.whoWinn();
            System.out.println("\"Улыбаеться\" Давай еще раз, а?");
            sleep(1500);
            FQ.fQ();
        }
    }
    int newCard(){
        Random rand = new Random();
        return 10 - rand.nextInt(9);
    }
    void rules() throws InterruptedException {
        System.out.print("\n" + "Рон: Слушай. Правила такие - каждый поочередно берет по одной карте.");
        sleep(3000);
        System.out.println(" У каждой карты есть своя цифра - от 2 до 10.");
        sleep(3000);
        System.out.print("Рон: Цель - набрать ближайщее к 21 число, но не более 21!");
        sleep(3000);
        System.out.println(" У кого число будет больше, тот и выиграет. Все просто!");
    }
    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getStack() {
        return stack;
    }

    void setStack(int stack) {
        this.stack = stack;
    }

    int getStackRon() {
        return stackRon;
    }

    void setStackRon(int stack2) {
        this.stackRon = stack2;
    }

    String getAnswer() {
        return answer;
    }

    void setAnswer(String answer) {
        this.answer = answer;
    }
}
