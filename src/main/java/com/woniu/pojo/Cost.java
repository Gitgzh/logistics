package com.woniu.pojo;

import java.io.Serializable;

public class Cost implements Serializable {
    private Integer costid;

    private Double wages;

    private Double operatename;

    private Double other;

    private static final long serialVersionUID = 1L;

    public Integer getCostid() {
        return costid;
    }

    public void setCostid(Integer costid) {
        this.costid = costid;
    }

    public Double getWages() {
        return wages;
    }

    public void setWages(Double wages) {
        this.wages = wages;
    }

    public Double getOperatename() {
        return operatename;
    }

    public void setOperatename(Double operatename) {
        this.operatename = operatename;
    }

    public Double getOther() {
        return other;
    }

    public void setOther(Double other) {
        this.other = other;
    }
    
    
}