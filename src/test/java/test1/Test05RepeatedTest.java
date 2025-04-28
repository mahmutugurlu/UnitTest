package test1;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.Assert.assertEquals;

public class Test05RepeatedTest {

    //bazı test senaryolarında bir testi aynı/benzer koşullarda
    //tekrar tekrar çalıştırmak isteyebiliriz

    @RepeatedTest(5)
    void testStringSubstring(){

        String str="Junit";

        assertEquals("unit",str.substring(1));

    }

    //repeated çoğunlukla random değerler
    //kullanılan metodların testinde kullanılır



}
