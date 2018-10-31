package fatfaggy.animals.entities.configs;

import fatfaggy.animals.entities.Cat;
import fatfaggy.animals.entities.Dog;
import fatfaggy.animals.entities.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean

    public Cat getCat() {
        return new Cat();
    }
    @Bean

    public Dog getDog() {
        return new Dog();
    }
    @Bean("parrot-kesha")
    public Object weNeedMoreParrots() {
        return new Parrot();
    }
}
