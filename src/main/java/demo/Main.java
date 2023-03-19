package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor = context.getBean(Doctor.class);
        Nurse nurse = context.getBean(Nurse.class);
        doctor.assist();
        nurse.assist();
        System.out.println("\n");

        Staff staff = context.getBean(Doctor.class);
        staff.assist();
        System.out.println("\n");

        doctor.setQualification("MBBS");
        System.out.println(doctor);
        Doctor otherDoctor = context.getBean(Doctor.class);
        System.out.println(otherDoctor);
        System.out.println("\n");
        //--------------------------------------------------------------------------------------------------------------

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        ShoppingCart cart = applicationContext.getBean(ShoppingCart.class);
        cart.checkout();










    }
}
