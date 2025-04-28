package test1;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;

public class Test04Exceptions {

    //String length metodu : null değer için NullPointerException
    @Test
    void testStringLengthForNullValue(){

        String str=null;

        assertThrows(
                NullPointerException.class,//beklenen exception
                ()->str.length()//method call
        );
    }

    //ArithmeticException : 8/0
    @Test
    void testDivideByZero(){

        int sayi1=999;
        int sayi2=0;

        assertThrows(ArithmeticException.class,
                ()-> System.out.println(sayi1/sayi2));

    }




}
