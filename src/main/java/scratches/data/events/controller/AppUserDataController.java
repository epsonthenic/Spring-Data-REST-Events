package scratches.data.events.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
//import com.spt.engine.entity.AppUserData;
//import com.spt.engine.service.AppUserDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import scratches.data.events.author.Author;
import scratches.data.events.service.AppUserDataService;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

@RestController
@RequestMapping("/app")
public class AppUserDataController {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AppUserDataService appUserDataService;

    @GetMapping("/gett")
    public List<Author> getAppUserData(){
        return appUserDataService.getAllAppUserData();
    }

    @PostMapping("/savebyjson")
    public void Savebyjson(@RequestBody String json){
        appUserDataService.Savebyjson(json);
    }

    @PutMapping("/Putbyclass/{id}")
    public Author Putsavebyclass(@RequestBody Author author , @PathVariable("id") Long id){
            return appUserDataService.Putsavebyclass(author,id);
    }

}
