
package com.hibernate.bean;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class User {
    @Id
    private String urn;
    private String psw;
    private String ll;
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getLl() {
        return ll;
    }

    public void setLl(String ll) {
        this.ll = ll;
    }

    
    
        public boolean equals(Object o){
        User u=(User) o;
        if((this.urn==u.getUrn()) && (this.psw.equals(u.getPsw()))){
            return true;
        }
        else{
            return false;
        }
    }
}
