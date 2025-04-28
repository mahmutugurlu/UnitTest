package test1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Test03BeforeAllAfterAll {


       /*
    veritabanı bağlantısını açma ve kapama vs
    büyük hazırlıklarda kullanılabilir
     */

    @BeforeAll
    static void connectDb(){
        System.out.println("veritabanı bağlantısı gerçekleşti.");
    }

    @AfterAll
    static void closeDbConnect(){
        System.out.println("veritabanı bağlantısı sonlandı.");

    }

    //String split metodunu test edelim
    @Test
    void testStringSplit(){
        String[] act="Junit bir test kütüphanesidir!".split(" ");
        String[] exp= {"Junit","bir","test","kütüphanesidir!"};

        assertArrayEquals(exp,act);
        System.out.println("testSplit çalıştı");
    }

    //Math min metodunu test edelim
    @Test
    void testMathMin(){

        int act=Math.min(5,99);
        int exp=5;

        assertEquals(exp,act);
        System.out.println("testMin çalıştı.");
    }


}
