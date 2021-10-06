package com.blogpessoal.blogpessoal.service.expections;

public class ResourceNotFoundExpection extends RuntimeException{

   public ResourceNotFoundExpection(Object id){
       super("Resource not found, Id " + id);
   }

}
