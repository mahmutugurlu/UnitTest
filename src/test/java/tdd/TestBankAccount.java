package tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//TDD:test driven development:kodlardan önce testi yazma yaklaşımıdır
//öncelikle testler yazılır ve ilk etapta testler başarısız olur, daha sonra
//testten geçecek şekilde minimum kod yazılır
//birimin işlevleri için tüm senaryolara göre testler önceden yazıldığı için
//kodun daha doğru, güvenilir yani sağlam olmasını sağlar
//1-henüz kodlar yok
//2-test senaryoları:
/*
i-Para Yatırma İşlemi:
Pozitif miktar yatırıldığında bakiye artmalı.
Negatif miktar yatırıldığında para yatırma başarısız olmalı,hata fırlatmalı.

ii-Para Çekme İşlemi:
Bakiye yeterli olduğunda para çekme işlemi başarılı olmalı,bakiye azalmalı
Bakiye yetersiz olduğunda para çekme işlemi başarısız olmalı, bakiye aynı kalmalı
Günlük çekim limiti aşıldığında para çekme işlemi başarısız olmalı,bakiye aynı kalmalı
Negatif miktar girildiğinde para çekme işlemi başarısız olmalı,hata fırlatmalı.

iii-Hesap Geçmişi:
Para çekme ve yatırma işlemleri hesap geçmişine eklenmeli.
 */
public class TestBankAccount {

    private BankAccount bankAccount;

    @BeforeEach
    void createBankAccount(){
        bankAccount=new BankAccount("12345",100.0,500.0);
    }

    @AfterEach
    void setBankAccountNull() {
        bankAccount = null;
    }

    //hesap oluşturma
    @Test
    void testCreateBankAccount(){
        assertNotNull(bankAccount);
        assertEquals("12345",bankAccount.getAccountNumber());
        assertEquals(100.0,bankAccount.getBalance());
        assertEquals(500.0,bankAccount.getDailyWithdrawLimit());
        assertEquals(0,bankAccount.getDailyWithdrawAmount());
        assertEquals(0,bankAccount.getAccountHistory().size());
    }

    //para yatırma testleri
    //Pozitif miktar yatırıldığında bakiye artmalı.
    @Test
    void testDepositForPositiveAmount(){
        int size=bankAccount.getAccountHistory().size();
        double balance= bankAccount.getBalance();

        assertTrue(bankAccount.deposit(200.0));
        assertEquals(balance+200.0,bankAccount.getBalance());
        assertEquals(size+1,bankAccount.getAccountHistory().size());

    }

    //Pozitif olmayan miktar yatırıldığında para yatırma başarısız olmalı,hata fırlatmalı.
    @Test
    void testDepositForNonPositiveAmount(){
        int size=bankAccount.getAccountHistory().size();//0
        double balance= bankAccount.getBalance();//100.0

        //amount: -100
        assertThrows(RuntimeException.class,()->bankAccount.deposit(-100.0));
        assertThrows(RuntimeException.class,()->bankAccount.deposit(0));
        assertEquals(balance,bankAccount.getBalance());
        assertEquals(size,bankAccount.getAccountHistory().size());

    }

    //Para Çekme İşlemleri:













}
