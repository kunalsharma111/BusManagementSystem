package com.hibernate.time;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dr {
    @Id
        private int bu;
    private String nm;
    private int cn;

    public int getBu() {
        return bu;
    }

    public void setBu(int bu) {
        this.bu = bu;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public int getCn() {
        return cn;
    }

    public void setCn(int cn) {
        this.cn = cn;
    }
            public boolean equalss(Object o){
        Dr u=(Dr) o;
        if((this.bu==u.getBu()) ){
            return true;
        }
        else{
            return false;
        }
}
}
