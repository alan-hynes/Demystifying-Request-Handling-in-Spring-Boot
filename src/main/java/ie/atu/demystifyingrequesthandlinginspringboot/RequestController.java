package ie.atu.demystifyingrequesthandlinginspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping("/hello")
        public String hello() {
            return "Hello World";
    }

    @GetMapping("/greet/{name}")
        public String greetByName(@PathVariable String name) {
            return "Hello " + name;
    }

    @GetMapping("/details")
    public String details(@RequestParam int age, String name) {
        return "Display: " + name + age;
    }

}
