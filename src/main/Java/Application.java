import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@RequestMapping("/")
public class Application {

    @RequestMapping("/")
    String home() {
        return "Hello World!1111";
    }


    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @RequestMapping("/say/{username}")
    public String sayHello(@PathVariable("username") String username){
        return String.format("user is %s", username);
    }

    @RequestMapping(value = "/say/{username}", method = RequestMethod.POST)
    public String postSay(@PathVariable("username") String username, Model model){
        model.addAttribute("name",username);
        return "hello";
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}