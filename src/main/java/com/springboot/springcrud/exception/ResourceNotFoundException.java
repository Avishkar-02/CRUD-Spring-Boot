package com.springboot.springcrud.exception;


public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String meassage){
        super(meassage);

    }
}
