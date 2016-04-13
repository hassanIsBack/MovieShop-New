package com.filmstore.model;
// Generated 19-Jan-2016 04:42:30 by Hibernate Tools 4.3.1



/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer id;
     private String firstname;
     private String lastname;
     private String email;
     private String username;
     private String password;
     private String streetname;
     private String postno;
     private String city;
     private String country;
     private String phonenum;
     private String role;

    public User() {
    }

    public User(String firstname, String lastname, String email, String username, String password, String streetname, String postno, String city, String country, String phonenum, String role) {
       this.firstname = firstname;
       this.lastname = lastname;
       this.email = email;
       this.username = username;
       this.password = password;
       this.streetname = streetname;
       this.postno = postno;
       this.city = city;
       this.country = country;
       this.phonenum = phonenum;
       this.role = role;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getStreetname() {
        return this.streetname;
    }
    
    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }
    public String getPostno() {
        return this.postno;
    }
    
    public void setPostno(String postno) {
        this.postno = postno;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    public String getPhonenum() {
        return this.phonenum;
    }
    
    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }




}


