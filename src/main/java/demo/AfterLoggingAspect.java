package demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterLoggingAspect {

    @After("execution(* *.*.checkout(..))")   // *.*.someMethod(..) == anyReturnType anyPackage.anyClass.checkoutMethod(any_input)
    public void afterLogger(){
        System.out.println("Other Loggers get called!");
    }
}
