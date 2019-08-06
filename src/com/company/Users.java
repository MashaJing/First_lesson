package com.company;
import java.util.Scanner;

public abstract class Users implements Comparable<Users>{
    int number;
    String name;
    short id;

    public Users() {

    }

    public String GetName() {
        return name;
    }

    public short GetId() {
        return id;
    }

    public int GetNumber() {
        return number;
    }


    public void SetName(String name) {
        this.name = name;
    }

    public void SetNumber(int number) {
        this.number = number;
    }

    public boolean equals(Users other) {
        return this.name.equals(other.name);
    }

    public int compareTo(Users other) {
        return this.id.compareTo(other.id);
    }
}
