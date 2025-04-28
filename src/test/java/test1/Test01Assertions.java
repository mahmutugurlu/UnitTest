package test1;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01Assertions {

    //Junit ile bir test metodu nasıl yazılır
    //jupiter ile public olma zorunlulugu kalkti
    @Test//bu bir test metodudur ve tek başına çalıştırılabilir
    /* public */ void test(){

        //örnek:x metodu için test işlemleri
    }

    //JDK da hazır olan metodları test edelim

    //String'in length metodunu test edelim
    //1-normal String -> karakter sayisi

    @Test
    void testStringLength_normalString(){

        String str="hello";
        int gercekDeger=str.length();//5
        int beklenenDeger=5;

        assertEquals(beklenenDeger,gercekDeger,"Yanlış karakter sayısı!!!");
        //beklenenDeger ile metodun geriye döndürdüğü gercekDeger i
        //karşılaştırır, eşit ise test geçer aksi halde test
        //başarısız olur

    }

    //2-empty("") string->0

    @Test
    void testStringLength_emptyString(){
        String str="";

        int actual=str.length();
        int expected=0;

        assertEquals(0,actual,"karakter sayısı 0 olmalıydı!!!");

    }


    //ödevv 3-whiteSpace("   ")->boşluk sayısı:3


    //4-null->NullPointerException fırlatmalı




    //Math addExact
    //1- + +
    @Test
    void testMathAddExactPositiveNumbers(){

        int result=Math.addExact(3,5);
        int expected=8;
        int notExpected=35;

        assertEquals(expected,result);
        assertNotEquals(notExpected,result);

    }

    //2- - -
    //3- 0 0
    //4- + -
    //5-todo: <integer> ArithmeticException



}
