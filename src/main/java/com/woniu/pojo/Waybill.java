package com.woniu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Waybill implements Serializable {
    private Integer wid;

    private Integer uid;

    private String goodsname;

    private Double goodssize;

    private Double goodsweight;

    private Date gettime;

    private Integer cid;

    private Integer did;

    private String giveplace;

    private String givepeople;

    private String givetel;

    private Integer tid;

    private Integer costid;

    private String wnum;

    private Integer wstatus;

    private Integer nid;

    private static final long serialVersionUID = 1L;

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Double getGoodssize() {
        return goodssize;
    }

    public void setGoodssize(Double goodssize) {
        this.goodssize = goodssize;
    }

    public Double getGoodsweight() {
        return goodsweight;
    }

    public void setGoodsweight(Double goodsweight) {
        this.goodsweight = goodsweight;
    }

    public Date getGettime() {
        return gettime;
    }

    public void setGettime(Date gettime) {
        this.gettime = gettime;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getGiveplace() {
        return giveplace;
    }

    public void setGiveplace(String giveplace) {
        this.giveplace = giveplace == null ? null : giveplace.trim();
    }

    public String getGivepeople() {
        return givepeople;
    }

    public void setGivepeople(String givepeople) {
        this.givepeople = givepeople == null ? null : givepeople.trim();
    }

    public String getGivetel() {
        return givetel;
    }

    public void setGivetel(String givetel) {
        this.givetel = givetel == null ? null : givetel.trim();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getCostid() {
        return costid;
    }

    public void setCostid(Integer costid) {
        this.costid = costid;
    }

    public String getWnum() {
        return wnum;
    }

    public void setWnum(String wnum) {
        this.wnum = wnum == null ? null : wnum.trim();
    }

    public Integer getWstatus() {
        return wstatus;
    }

    public void setWstatus(Integer wstatus) {
        this.wstatus = wstatus;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }
}