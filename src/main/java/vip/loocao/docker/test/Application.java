package vip.loocao.docker.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author loocao
 * @since 2017/2/8
 */
@Controller
@RequestMapping("/")
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

    @ResponseBody
    @RequestMapping("/")
    public String index() {
        return "Hello world!";
    }
}
