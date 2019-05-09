package scratches.data.events.service;

//import com.spt.engine.entity.AppUserData;

import scratches.data.events.author.Author;

import java.util.List;

public interface AppUserDataService {

    List<Author> getAllAppUserData();

    void Savebyjson(String json);

    Author Putsavebyclass(Author author, Long id);

}
