package scratches.data.events.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import scratches.data.events.author.AuthorRepositoryEventHandler;
import scratches.data.events.book.BookEventHandler;

/**
 * @author Rashidi Zin
 */
@Configuration
public class RepositoryHandlerConfiguration {

    public RepositoryHandlerConfiguration(){
        super();
    }

    @Bean
    AuthorRepositoryEventHandler authorRepositoryEventHandler() {
        return new AuthorRepositoryEventHandler();
    }

    @Bean
    BookEventHandler bookEventHandler(){
        return new BookEventHandler();
    }

}
