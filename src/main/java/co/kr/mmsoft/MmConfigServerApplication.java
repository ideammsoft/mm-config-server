package co.kr.mmsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MmConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MmConfigServerApplication.class, args);
    }

}
