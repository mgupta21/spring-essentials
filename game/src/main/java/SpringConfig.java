import org.java.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.activation.DataSource;

/**
 * Created by mgupta on 8/13/16.
 */
@Import(SpringInfraConfig.class)
@Configuration
public class SpringConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public Game game() {
        BaseballGame baseballGame = new BaseballGame(cubs(), whiteSox());
        baseballGame.setDataSource(dataSource);
        return baseballGame;
    }

    @Bean
    public Team cubs() {
        return new Cubs();
    }

    @Bean
    public Team whiteSox() {
        return new WhiteSox();
    }

}
