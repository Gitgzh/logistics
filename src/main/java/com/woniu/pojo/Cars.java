package com.woniu.pojo;

import java.io.Serializable;
import java.util.Set;

public class Cars implements Serializable {
    private Integer cid;

    private String cnum;

    private Integer tid;

    private String cphoto;

    private Integer cstatus;

    private Double ccapacity;

    private Integer fid;
    
    private Set<Fleets> fleets;

    private static final long serialVersionUID = 1L;

    public Set<Fleets> getFleets() {
		return fleets;
	}

	public void setFleets(Set<Fleets> fleets) {
		this.fleets = fleets;
	}

	public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCnum() {
        return cnum;
    }

    public void setCnum(String cnum) {
        this.cnum = cnum == null ? null : cnum.trim();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getCphoto() {
        return cphoto;
    }

    public void setCphoto(String cphoto) {
        this.cphoto = cphoto == null ? null : cphoto.trim();
    }

    public Integer getCstatus() {
        return cstatus;
    }

    public void setCstatus(Integer cstatus) {
        this.cstatus = cstatus;
    }

    public Double getCcapacity() {
        return ccapacity;
    }

    public void setCcapacity(Double ccapacity) {
        this.ccapacity = ccapacity;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }
    
}