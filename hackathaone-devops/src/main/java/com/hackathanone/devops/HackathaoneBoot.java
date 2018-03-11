package com.hackathanone.devops;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = {
    "com.hackathanone.devops"
})
public class HackathaoneBoot implements CommandLineRunner {

    private static final Logger LOGGER = LogManager.getLogger("HackathaoneBoot");
    
   

    public void run(String... arg0) throws Exception {
        if (arg0.length > 0 && arg0[0].equals("exitcode")) {
            LOGGER.info("Application shutdown successfully....");
            throw new ExitException();
        }
}
    public static void main(String[] args) throws Exception {
        new SpringApplication(HackathaoneBoot.class).run(args);
    }

    class ExitException extends RuntimeException implements ExitCodeGenerator {
        private static final long serialVersionUID = 1L;

        public int getExitCode() {
            return 10;
        }

    }

}
