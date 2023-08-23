package abcd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config3 {
    @Bean(initMethod = "init", destroyMethod = "bibi")
    public Truck leva(){
        return new Truck("Leva", 600);
    }

    @Bean
    @Scope("singleton")
    public Truck kesha(){
        return new Truck("Kesha", 500);
    }

    @Bean
    @Scope("prototype")
    public Truck dima(){
        Truck tr =  new Truck("Dima", 355);
        tr.paint();
        return tr;
    }
}
