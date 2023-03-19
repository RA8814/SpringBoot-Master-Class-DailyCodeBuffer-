package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(){
        //Logging
        //Authentication & Authorisation
        //Sanitising of Data
        System.out.println("Checkout method from ShoppingCart called.");
    }
}
