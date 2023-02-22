package com.projeto.introducaotesteautomatizados;

import static org.junit.jupiter.api.Assertions.assertEquals;


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



}
