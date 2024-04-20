package esp.dgi.carshop.Sbapp0;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SbApp0Application {

    private static final Logger logger = LoggerFactory.getLogger(SbApp0Application.class);

    public static void main(String[] args) {
        SpringApplication.run(SbApp0Application.class, args);
        logger.info("Application started! http://127.0.0.1:8081/hello");
    }

    @RestController
    @RequestMapping("/hello")
    class SbAppController {

        @Value("${fullname: Fama}")
        private String fullname;

        @GetMapping
        String getFullname() {
            return "Hello " + this.fullname + "!";
        }
    }
}
