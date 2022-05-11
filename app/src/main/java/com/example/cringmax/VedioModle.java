package com.example.cringmax;

public class VedioModle {
    //declaring 3 variable to keep 3 things
    String url,title,desc;

    public VedioModle(String url,String title,String desc) {
        this.url = url;
        this.title=title;
        this.desc= desc;

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
