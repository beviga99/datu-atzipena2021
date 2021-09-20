package eus.uni.dam;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IocBeansApplication3 {

    public static void main(String[] args) {
        
        //Kontestua hasieratu
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans03.xml");

        //Bean-ak erabili
        Persona p1=null;
        Persona p2=null;
        
        p1 = appContext.getBean(Persona.class); //Kontenedoreak dependentzia "injektatu" du
        p2 = appContext.getBean(Persona.class); //Kontenedoreak dependentzia "injektatu" du
        
        p1.aurkeztu();
        p2.aurkeztu();
        
        //Testuingurua itxi
        ((ClassPathXmlApplicationContext) appContext).close();
    }

}