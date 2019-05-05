/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.time;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author kunal
 */
@Entity
public class Tm{
    @Id
    private int bn;
    private String rom;
    private String too;
    private int tim;

    public int getBn() {
        return bn;
    }

    public void setBn(int bn) {
        this.bn = bn;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public String getToo() {
        return too;
    }

    public void setToo(String too) {
        this.too = too;
    }

    public int getTim() {
        return tim;
    }

    public void setTim(int tim) {
        this.tim = tim;
    }

    
        public boolean equalss(Object o){
        Tm u=(Tm) o;
        if((this.bn==u.getBn()) ){
            return true;
        }
        else{
            return false;
        }
    
}
}
