package test2;

import mockito1.PaymentManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPaymentManager {

    private PaymentManager paymentManager;

    @BeforeEach
    void createPaymentManager(){
        paymentManager=new PaymentManager();
    }

    @AfterEach
    void setPaymentManagerToNull(){
        paymentManager=null;
    }

    //getPaymentStatus metodunu test edelim
    //1-id=150
    //2-id=50
    //3-id=0

    @Test
    void testGetPaymentStatusForIdGraterThan100(){
        String actual= paymentManager.getPaymentStatus(150);
        String expected="SUCCESS";

        assertEquals(expected,actual,"STATU YANLIŞ!");
    }
}
