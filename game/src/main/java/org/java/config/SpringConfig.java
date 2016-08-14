package org.java.config;

import org.java.entities.BaseballGame;
import org.java.entities.Game;
import org.java.entities.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * Created by mgupta on 8/13/16.
 */
@Import(SpringInfraConfig.class) // Import another spring config
@Configuration
@ComponentScan(basePackages = "org.java.entities")
public class SpringConfig {

    @Autowired // Works as there is only one bean declaration of DataSource
    private DataSource dataSource;

    @Autowired
    @Qualifier("cubs") // Need qualifier since there are more than one bean of type Team
    private Team home;

    @Autowired
    @Qualifier("whiteSox")
    private Team away;

    /*@Resource // Autowire by name // Alternative to use Autowired + Qualifier
    private Team whiteSox;*/

    /*@Bean
    public Game game(DataSource dataSource) {
        BaseballGame baseballGame = new BaseballGame(cubs(), whiteSox());
        baseballGame.setDataSource(dataSource);
        return baseballGame;
    }*/

    @Bean
    @Scope("prototype")
    public Game game() {
        BaseballGame baseballGame = new BaseballGame(home, away);
        baseballGame.setDataSource(dataSource);
        return baseballGame;
    }

    /*@Bean // No need to declare these beans as components in entities package are being scanned
    public Team cubs() {
        return new Cubs();
    }

    @Bean
    public Team whiteSox() {
        return new WhiteSox();
    }*/

}
