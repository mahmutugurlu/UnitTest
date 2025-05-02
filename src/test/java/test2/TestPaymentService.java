package test2;

import mockito1.PaymentManager;
import mockito1.PaymentService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TestPaymentService {

    //checkPaymentStatus metodunu test edelim
    //id:0,50,150

    //id:150 için test edelim
    //verilen idye göre beklenen STATUS:SUCCESS
    //getPaymentStatus metodu aynı id ile 1 kez çağrılır

    @Test
    void testCheckPaymentStatusForIdGraterThan100() {

        //PaymentService objesi PaymentManager objesine bağımlı
        // PaymentManager pm=new PaymentManager();

        //PaymentManager objesi yerine vekil(sahte, mock) bir obje verelim
        PaymentManager pm = mock(PaymentManager.class);
        //vekil objeye nasıl davranması gerektiğini söyleyelim
        when(pm.getPaymentStatus(150)).thenReturn("SUCCESS");

        //PaymentService objesine ihtiyaç var
        PaymentService paymentService = new PaymentService(pm);

        String actual = paymentService.checkPaymentStatus(150);
        String expected = "STATUS:SUCCESS";

        assertEquals(expected, actual);

        //getPaymentStatus metodu aynı id ile 1 kez çağrılıyor mu
        verify(pm, times(1)).getPaymentStatus(150);

    }


}