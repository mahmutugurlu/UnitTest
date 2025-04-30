package test1;

import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

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

    @RepeatedTest(5)
    void testAddExactByRandomValue(){
        Random random=new Random();
        int sayi1=random.nextInt(100);
        int sayi2=random.nextInt(100);

        assertEquals(sayi1+sayi2,Math.addExact(sayi1,sayi2));

        System.out.println("sayı1: "+sayi1+"----"+"sayı2: "+sayi2);

    }



}
