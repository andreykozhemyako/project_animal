import fatfaggy.animals.entities.Cat;
import fatfaggy.animals.entities.Dog;
import fatfaggy.animals.entities.Parrot;
import fatfaggy.animals.entities.configs.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        // создаем пустой спринговый контекст, который будет искать свои бины по аннотациям в указанном пакете
        ApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Cat cat = context.getBean(Cat.class);
        Dog dog = context.getBean(Dog.class);
        Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());
    }
}
