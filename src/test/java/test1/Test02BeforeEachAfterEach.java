package test1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class Test02BeforeEachAfterEach {


      /*
    @BeforeEach
    Test senaryoları başlamadan önce ortak kaynakların
    (örneğin, veritabanı bağlantıları, nesne oluşturma)
    ayarlanması veya başlangıç değerlerinin belirlenmesi

    @AfterEach
    Test sonrasında kaynakların serbest bırakılması
    (örneğin, dosya kapatma, veritabanı bağlantısını sonlandırma)
    veya geçici verilerin temizlenmesi

     gibi işler yapılır.
     */

    String str;

    @BeforeEach
    void createString(){
        str="merhaba";
        System.out.println("before each çalıştı.");
    }

    @AfterEach
    void setStrToNull(){
        str=null;
        System.out.println("after each çalıştı.");

    }

    //upperCase'i test edelim
    @Test
    void testUpperCase(){

        String act=str.toUpperCase();
        String exp="MERHABA";

        assertEquals(exp,act);
        System.out.println("testuppercas calisti");

    }

    //contains metodunu test edelim.
    @Test
    void testContains(){
        boolean act=str.contains("z");
        boolean exp=false;

        assertEquals(exp,act);
        //veya
        assertFalse(act);
        assertTrue(str.contains("m"));

        System.out.println("testContains çalıştı");

    }


}
