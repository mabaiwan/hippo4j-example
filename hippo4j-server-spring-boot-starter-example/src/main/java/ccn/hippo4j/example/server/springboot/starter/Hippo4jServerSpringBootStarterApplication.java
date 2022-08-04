package ccn.hippo4j.example.server.springboot.starter;

import cn.hippo4j.core.enable.EnableDynamicThreadPool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDynamicThreadPool
@SpringBootApplication(scanBasePackages = "cn.hippo4j.example.core")
public class Hippo4jServerSpringBootStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(Hippo4jServerSpringBootStarterApplication.class, args);
    }
}
