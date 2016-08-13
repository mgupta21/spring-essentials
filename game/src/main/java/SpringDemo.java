import org.java.entities.Game;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by mgupta on 8/13/16.
 */
public class SpringDemo {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Game game = context.getBean("game", Game.class);
        System.out.println(game.playGame());
    }

}
