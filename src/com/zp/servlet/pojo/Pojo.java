package com.zp.servlet.pojo;

public class Pojo {
    private int id;
    private String sentence;
    private String come;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getCome() {
        return come;
    }

    public void setCome(String come) {
        this.come = come;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", sentence='" + sentence + '\'' +
                ", come='" + come + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
