import org.java.entities.*;

/**
 * Created by mgupta on 8/13/16.
 */
public class SimpleDemo {
    public static void main(String[] args) {
        Team cubs = new Cubs();
        Team whiteSox = new WhiteSox();
        Game baseballGame = new BaseballGame(cubs, whiteSox);
        System.out.println(baseballGame.playGame());
    }
}
