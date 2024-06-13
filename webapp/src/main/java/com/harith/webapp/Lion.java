package com.harith.webapp;

public class Lion {
    private String name;
    private int id;
    private String lang;
 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
    
    @Override
    public String toString() {
        return "Lion [id=" + id + ", lang=" + lang + ", name=" + name + "]";
    }
}
