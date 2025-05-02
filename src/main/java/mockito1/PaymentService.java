package mockito1;

/*
Senaryo: PaymentService sınıfı, bir ödeme geçmişi tutan bir PaymentManager sınıfına bağımlıdır.
    PaymentService, ödeme geçmişini kontrol etmek için PaymentManager'ı kullanır. Bizim test
    senaryomuzda, PaymentService'in checkPaymentStatus metodunu test edeceğiz ve PaymentManager'ın
    gerçek bir örneğini kullanmak yerine mock bir nesneyle değiştireceğiz.
 */
public class PaymentService {

    private PaymentManager paymentManager;

    public PaymentService(PaymentManager paymentManager) {
        this.paymentManager = paymentManager;
    }

    //kullanıcıya ödeme durumunu STATUS:SUCCESSFUL
    public String checkPaymentStatus(int id){
        String str="STATUS:";
        String result=str+paymentManager.getPaymentStatus(id);

        return result;
    }
}