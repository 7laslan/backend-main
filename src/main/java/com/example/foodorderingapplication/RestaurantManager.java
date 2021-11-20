package com.example.foodorderingapplication;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Table(name = ???)
public class RestaurantManager {

    private String name, username, password;
    @Enumerated(EnumType.STRING)
    private Role role;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "admin_id")
    private Long adminId;

    public RestaurantManager(String name, String username, String password, Role role, Long adminId) {

        this.name = name;
        this.username = username;
        this.password = password;
        this.role = role;
        this.adminId = adminId;
    }

    public Long getAdminId()
    {
        return adminId;
    }

    public void setAdminId(Long adminId)
    {
        this.adminId = adminId;
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
