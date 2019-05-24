import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2019/5/14 17:44
 */
@SpringBootApplication
@ComponentScan("com.course")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
