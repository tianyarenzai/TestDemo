import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/12/21 0021.
 */
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String greeting(){
        return "Hello World!";
    }

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
