package org.summary.model;

import java.io.Serializable;

/**
 * Created by CharlesYang on 2018/3/8.
 */
public class Book implements Serializable{
    private Integer id;
    private String name;
    private String author;
    public Book(){}
    public Book(Integer id, String name, String author){
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString(){
        return "Book id is " + id +", name is " + name + ", author is " + author;
    }

}
