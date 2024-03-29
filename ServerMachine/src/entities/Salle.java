/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 *
 * @author aaaa
 */@Entity
 @NamedQuery(name = "findAllSalle", query= "from Salle")
public class Salle implements Serializable {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private String code;
     public Salle(){
     }
     public Salle(String code){
         this.code = code;
     }
     public Salle(int id,String code){
         this.id=id;
         this.code = code;
     }
      public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String toString() {
        return "Salle{" + "id=" + id + ", code=" + code + '}';
    }
    
}
