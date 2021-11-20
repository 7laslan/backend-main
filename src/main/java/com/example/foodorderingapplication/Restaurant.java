package com.example.foodorderingapplication;

import java.util.List;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Table(name = restaurant)
public class Restaurant {

    private String restaurantName, address;
    private long operatingHours;
    private Type type;
    private List<Product> menu;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "restaurant_id")
    private Long restaurantId;

    public Restaurant(String restaurantName, String address, long operatingHours, Type type, Long restaurantId){

        this.restaurantName = restaurantName;
        this.address = address;
        this.operatingHours = operatingHours;
        this.type = type;
        this.restaurantId = restaurantId;

    }

    public Long getRestaurantId()
    {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId)
    {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName()
    {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName)
    {
        this.restaurantName = restaurantName;
    }

    public String Address()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public long getOperatingHours()
    {
        return operatingHours;
    }

    public void setOperatingHours(long operatingHours)
    {
        this.operatingHours = operatingHours;
    }

    public Type getType()
    {
        return type;
    }

    public void setType(Type type)
    {
        this.type = type;
    }
    
    public List<Product> getMenu()
    {
        return menu;
    }

    public void setMenu(List<Product> menu)
    {
        this.menu = menu;
    }
    
}
