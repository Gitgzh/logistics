package com.woniu.pojo;

import java.io.Serializable;

public class Fleets implements Serializable {
    private Integer fid;

    private String fname;

    private Double fcapacity;

    private Integer fstatus;

    private static final long serialVersionUID = 1L;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public Double getFcapacity() {
        return fcapacity;
    }

    public void setFcapacity(Double fcapacity) {
        this.fcapacity = fcapacity;
    }

    public Integer getFstatus() {
        return fstatus;
    }

    public void setFstatus(Integer fstatus) {
        this.fstatus = fstatus;
    }
}