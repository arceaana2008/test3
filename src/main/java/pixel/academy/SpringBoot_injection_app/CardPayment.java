package pixel.academy.SpringBoot_injection_app;

import org.springframework.stereotype.Component;

@Component
public class CardPayment implements PaymentService {

    @Override
    public String getPaymentDetails(double amount) {
        return "Plata de " + amount + "Lei a fost procesata prin Card.";

    }

}
