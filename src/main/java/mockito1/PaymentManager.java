package mockito1;

public class PaymentManager {

    //yapılan ödemenin statüsünü gösteren bir metod
    public String getPaymentStatus(int paymentId){
        if (paymentId>=100){
            return "SUCCESS.";
        }else if(paymentId>0) {
            return "FAILURE";
        }else {
            return "UNKNOWN";
        }
    }

}
