package com.woniu.pojo;

import java.io.Serializable;

public class Drivers implements Serializable {
    private Integer did;

    private String dname;

    private String dtel;

    private String dface;

    private Integer fid;

    private String dphoto;

    private Integer dstatus;

    private static final long serialVersionUID = 1L;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getDtel() {
        return dtel;
    }

    public void setDtel(String dtel) {
        this.dtel = dtel;
    }

    public String getDface() {
        return dface;
    }

    public void setDface(String dface) {
        this.dface = dface == null ? null : dface.trim();
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getDphoto() {
        return dphoto;
    }

    public void setDphoto(String dphoto) {
        this.dphoto = dphoto == null ? null : dphoto.trim();
    }

    public Integer getDstatus() {
        return dstatus;
    }

    public void setDstatus(Integer dstatus) {
        this.dstatus = dstatus;
    }
}