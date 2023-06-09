package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")     // (@Component + Prototype - BeanConfig) means that every time a bean is created of this class, it makes a new object
public class Doctor implements Staff, BeanNameAware {
    private String qualification;

    public Doctor() {
    }

    public Doctor(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void assist(){
        System.out.println("Doctor is assisting.");
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName() method is called.");
    }
}
