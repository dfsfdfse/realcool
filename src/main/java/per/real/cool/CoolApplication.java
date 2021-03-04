package per.real.cool;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("per.real.cool.module.*.dao")
public class CoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoolApplication.class, args);
    }

}
