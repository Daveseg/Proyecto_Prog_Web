/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1HTML.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name="tablaCakes")
public class TablaCake implements Serializable{
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String cake;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCake() {
        return cake;
    }

    public void setCake(String cake) {
        this.cake = cake;
    }
}
