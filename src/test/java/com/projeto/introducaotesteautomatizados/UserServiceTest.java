package com.projeto.introducaotesteautomatizados;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;



public class UserServiceTest {
   




    //instaciando a classe UserService para testar 
    private UserService userService = new UserService(); 
 
    //testando a criacao do usuario da classe UserService
 @Test
 public void createUser_ReturnUsers(){
    //AAA
   //Arrange
   
   User user =  new User("Leoanardo", "1234556");

   
   //Act
   List<User> users = userService.create(user);
   

   //assertEquals , verifica que vc esperava um valor  e obteve outro valor ou o mesmo valor
   //entao ele vai  verificar se esses dois valores sao iguais
   assertEquals(1, users.size());
   assertEquals(user, users.get(0));
}

@Test
//cenario de error
//se tentar criar um usuario  que ja tem o username sendo utilizado eu vou querer que seja criado um Exception
public void createUser_ThrowsException(){


   
   User user =  new User("Leoanardo", "1234556");
   userService.create(user);
   
   
   //quando executar um create , com os dados  de usuario que  ja existe quero que seja lançado um Exception
   assertThrows(RuntimeException.class,
   ()->  userService.create(user));
   

}

}
