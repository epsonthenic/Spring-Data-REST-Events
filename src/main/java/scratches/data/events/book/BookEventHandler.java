package scratches.data.events.book;

import org.springframework.data.rest.core.annotation.*;
import scratches.data.events.author.Author;

import java.util.logging.Logger;

@RepositoryEventHandler(Book.class)
public class BookEventHandler {

    Logger logger = Logger.getLogger("Class AuthorEventHandler");

    @HandleBeforeCreate
    public void handleBookBeforeCreate(Book book){
        logger.info("Inside Book Before Create....");
        String name = book.getTitle();
    }

    @HandleBeforeCreate
    public void handleAuthorBeforeCreate(Author author){
        logger.info("Inside Author Before Create....");
        String name = author.getName();
    }

    @HandleAfterCreate
    public void handleAuthorAfterCreate(Author author){
        logger.info("Inside Author After Create....");
        String name = author.getName();
    }

    @HandleAfterCreate
    public void handleBookAfterCreate(Book book){
        logger.info("Inside Book After Create....");
        String name = book.getTitle();
    }

    @HandleAfterSave
    public void handleAuthorAfterSave(Author author){
        logger.info("Author SaveAfter Create ....");
        String name = author.getName();
    }

    @HandleBeforeSave
    public void handleAuthorBeforeSave(Author author){
        logger.info("Author SaveBefore Create....");
        String name = author.getName();
    }

    @HandleAfterSave
    public void handleBookAfterSave(Book book){
        logger.info("Book SaveAfter Create ....");
        String name = book.getTitle();
    }

    @HandleBeforeSave
    public void handleBookBeforeSave(Book book){
        logger.info("Book SaveBefore Create....");
        String name = book.getTitle();
    }
}
