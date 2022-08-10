package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//        1. Maven проект тузунуз (dependency spring context кошуп)
//        2. Animal деген интерфейс тузуп, анын animalPlus жана animalMinus деген методдору болуш керек.
//        3. Сиз кайсы жаныбарды жакшы корсонуз, ошого жараша класс тузуп,  свойствасына породасын, тусун ж.б.у.с. кошсонуз болот.  Сиз тузгон класс Animal интерфейсин реализация кылыш керек.
//        4. Person деген класс тузуп, свойствасына animal, name, age бериниз.
//        5. Main'ден spring колдонуп озунуздун жана жакын бир адамыныздын жакшы коргон жаныбарын консольго чыгарыныз
//
//        PS: bean'дер тузулуш керек жана маалыматтар application.properties файлга жазылыш керек.
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person=context.getBean("person",Person.class);
        System.out.println(person);
        person.getAllMethodAnimal();

        Dog dog = context.getBean("dog",Dog.class);
        System.out.println(dog);

        Horse horse = context.getBean("horse",Horse.class);
        System.out.println(horse);

        context.close();
    }
}
