import java.util.Scanner;
import static java.lang.Thread.sleep;

class Introduce {
    static void introduce() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Рон: Привет тебе путник!");
        sleep(2000);
        System.out.print(" Присаживайся!");
        sleep(3000);
        System.out.println(" Как тебя зовут?" + "\n");
        sleep(1500);
        System.out.println("Рыжебородый мужчина с широкой улыбкой протянул свою ладонь и пожал вам руку." + "\n");
        sleep(4000);
        System.out.print("Рон: Аа, я смотрю ты не умеешь говорить на нашем языке!");
        sleep(2500);
        System.out.println(" Ничего страшного, вот перо. Напиши тут, я пойму тебя!");
        Game.game.setName(scan.next());
        sleep(1500);
    }
}
