package com.farhanunnasih.notes;

public class Notes {

    String id;
    String date;
    String title;
    String desc;

    public Notes(String id, String date, String title, String desc) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }
}
