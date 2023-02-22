package com.projeto.introducaotesteautomatizados;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    List <User> users  =  new ArrayList<>();


    public List <User> create (User user){
      // se ja estiver um usuario com os mesmo dados  eu posso lancar uma Exception 
      if(users.contains(user))
       throw new RuntimeException();

       
      users.add(user);
          return users;
 
          
          
    }  
   
 
 }

