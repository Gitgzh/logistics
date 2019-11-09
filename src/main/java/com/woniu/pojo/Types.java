package com.woniu.pojo;

import java.io.Serializable;

public class Types implements Serializable {
    private Integer tid;

    private String tname;

    private Double tsize;

    private static final long serialVersionUID = 1L;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Double getTsize() {
        return tsize;
    }

    public void setTsize(Double tsize) {
        this.tsize = tsize;
    }
}