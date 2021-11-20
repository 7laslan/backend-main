package com.example.foodorderingapplication;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Table(name = "customers")
public class Customer {

    private String name, username, password;
    @Enumerated(EnumType.STRING)
    private Role role;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "customer_id")
    private Long customerId;

    public Customer(String name, String username, String password, Role role, Long customerId) {

        this.name = name;
        this.username = username;
        this.password = password;
        this.role = role;
        this.customerId = customerId;
    }

    public Long getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId(Long customerId)
    {
        this.customerId = customerId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Role getRole()
    {
        return role;
    }

    public void setRole(Role role)
    {
        this.role = role;
    }
    
}
