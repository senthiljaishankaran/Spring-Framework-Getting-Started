package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

// defining scope
@Scope(scopeName = "prototype")
// Class With a method
@Component
public class Leader implements Staff, BeanNameAware {
    @Override
    public String toString() {
        return "Leader{" +
                "Qualification='" + Qualification + '\'' +
                '}';
    }

    // Assigning the property
    private String Qualification;

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    public void working(){
        System.out.println("leader is assigning the jobs");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name Aware Method is Invoked");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("Post Construct Method is Invoked");
    }
}
