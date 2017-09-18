package resource;


import controller.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class RestApi {

    @Autowired
    private AuthService authService;

    @RequestMapping(path = "", method = RequestMethod.GET)
    public String checkHealth() {
        return "The application is running! :)";
    }

    @RequestMapping(path = "database", method = RequestMethod.GET)
    @PreAuthorize("hasPermission('coffeelink.Country', 'READ')")
    public String saveSomethingToDB() {
//        final Person person = new Person();
//        person.setName("Johannes");
//        person.setAge("23");
//
//        final Person savedJohannes = authService.saveToDB(person);
//
//        return savedJohannes == null ? "Could not save to DB" :
//                "Gratz, a Person with the id " + savedJohannes.getId() + " was saved to the DB";
    }

}
