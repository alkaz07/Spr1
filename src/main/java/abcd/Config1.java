package abcd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Config1 {
    @Bean
    public Car car2(){
        return new Car("Ford", 175);
    }
}
