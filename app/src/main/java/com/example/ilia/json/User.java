package com.example.ilia.json;



public class User implements Comparable<User>{
    private String fullName;
    private int age;
    private float weight;
    private String gender;
    private String married;
    private boolean protecte;
    public int check;

    public String toString() {
        sort();
        StringBuilder all = new StringBuilder();
        all.append("fullName: '" + this.fullName + "', age: '" + this.age + "', weight: '" + this.weight + "'\n");
        return all.toString();
    }

    public void sort() {
        check = age * Math.abs((int)weight - 50);
    }
    public int getC() {
        return check;
    }

    public int compareTo(User o) {
        if (this.check > o.check){
            return 1;
        } else return  0;
    }
}
