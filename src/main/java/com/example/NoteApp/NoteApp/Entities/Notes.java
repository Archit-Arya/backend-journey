package com.example.NoteApp.NoteApp.Entities;

import java.util.Date;

public class Notes {
    private String id;
    private Date date;
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", content='" + content + '\'' +
                '}';
    }
}
