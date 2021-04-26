package com.example.demo.pojo;

public class Rec {
    private final Integer id;
    private final String name;
    private final String path;

    public Rec(Integer id, String name, String path) {
        this.id = id;
        this.name = name;
        this.path = path;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }
}
