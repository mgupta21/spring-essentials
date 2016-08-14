import org.java.config.SpringConfig;
import org.java.entities.Game;
import org.java.entities.Team;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by mgupta on 8/13/16.
 */
public class SpringDemo {

    public static void main(String[] args) {

        // XML Based
        // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Annotation Based
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Game game1 = context.getBean("game", Game.class);
        Team royals = context.getBean("royals", Team.class);
        game1.setAwayTeam(royals);
        System.out.println(game1);
        System.out.println(game1.playGame());

        Game game2 = context.getBean("game", Game.class);
        System.out.println(game2);
        System.out.println(game2.playGame());

        System.out.println(game1); // still prints game 2 unless game is prototype scoped in config

    }

}
