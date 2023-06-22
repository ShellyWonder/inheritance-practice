package com.coderscampus.base;

public class NormalUser extends User {
/**
 * @param username
 * @param password
 */

public NormalUser() {    
    this.setReadAccess(true);
    this.setWriteAccess(true);
    this.setSuperUser(false);   
  } 
}
