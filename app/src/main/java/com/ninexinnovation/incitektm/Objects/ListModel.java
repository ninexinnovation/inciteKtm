package com.ninexinnovation.incitektm.Objects;

public class ListModel {
    private String profile_name;
    private String product_name;
    private String location;
    private String rating;

    public void setProfileName(String profile_name){
        this.profile_name=profile_name;
    }
    public void setProductName(String product_name){
        this.product_name=product_name;
    }
    public void setLocation(String location){
        this.location=location;
    }
    public void setRating(String rating){
        this.rating=rating;
    }

    public String getProfileName(){
        return this.profile_name;
    }
    public String getProductName(){
        return this.product_name;
    }
    public String getLocation(){
        return this.location;
    }

    public String getRating(){
        return this.rating;
    }
}