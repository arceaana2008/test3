package pixel.academy.SpringBoot_injection_app;

import pixel.academy.SpringBoot_injection_app.PaymentService;

@Component
public class CashPayment implements PaymentService {

    @Override
    public String getPaymentDetails(double amount){
        return "Plata de " + amount + "Lei a fost procesata pri Cash.";
    }
}
