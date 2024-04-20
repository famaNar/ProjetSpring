package esp.dgi.carshop.Sbapp0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbApp0Application {

	public static void main(String[] args) {
		SpringApplication.run(SbApp0Application.class, args);
		System.out.println("Hello !my name is Fama");
		System.out.println("I love SpringBoot");


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
