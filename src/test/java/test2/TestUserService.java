package test2;

import mockito2.UserRepo;
import mockito2.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class TestUserService {


    //getUserNameById metodunu test edelim
    //1-id(1,2,3) verildiğinde return Dear Username
    //2-reponun getUsernameById(aynı id) ile tam 1 kez çağrılmalı
    //negatif senaryo: id=99 vs olduğunda exception(Runtime) fırlatmalı

    @Test
    void testGetUserNameByIdForExistsId(){

        UserRepo repo=mock(UserRepo.class);
        when(repo.getUsernameById(1)).thenReturn("Jack");


        UserService userService=new UserService(repo);
        assertEquals("Dear Jack",userService.getUserNameById(1));

        verify(repo,times(1)).getUsernameById(1);

    }

    @Test
    void testGetUserNameByIdForNonExistsId(){

        UserRepo repo=mock(UserRepo.class);
        when(repo.getUsernameById(99)).thenReturn(null);


        UserService userService=new UserService(repo);
        assertThrows(RuntimeException.class,()->
                userService.getUserNameById(99));

        verify(repo,times(1)).getUsernameById(99);

    }

    //getUsernameById metodu ayrıca test edilmeli











}