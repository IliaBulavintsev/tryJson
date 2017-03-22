package com.example.ilia.json;


import android.util.Log;

public class User{
    private String fullName;
    public int age;
    public float weight;
    private String gender;
    private String married;
    private boolean protecte;

    public String toString() {
        StringBuilder all = new StringBuilder();
        all.append("fullName: '" + this.fullName + "', age: '" + this.age + "', weight: '" + this.weight +"kaff: "+ this.age*Math.abs(this.weight-50)+ "'\n");
        return all.toString();
    }
}
