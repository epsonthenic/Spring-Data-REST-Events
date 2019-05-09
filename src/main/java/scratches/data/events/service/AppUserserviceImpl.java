package scratches.data.events.service;

import com.google.gson.Gson;
//import com.spt.engine.entity.AppUserData;
//import com.spt.engine.repository.AppUserDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scratches.data.events.author.Author;
import scratches.data.events.author.AuthorRepository;

import java.util.List;

@Service
public class AppUserserviceImpl implements AppUserDataService{

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> getAllAppUserData() {
        return authorRepository.findAll();
    }

    @Override
    public void Savebyjson(String json) {
        LOGGER.info("{}",json);
        Gson gson = new Gson();
        Author author = gson.fromJson(json,Author.class);
        authorRepository.save(author);
        LOGGER.info("Save By Json : {}",author.getId());
    }

    @Override
    public Author Putsavebyclass(Author author, Long id) {
        author.setId(id);
        authorRepository.save(author);
        return authorRepository.findById(id).get();

    }

}
