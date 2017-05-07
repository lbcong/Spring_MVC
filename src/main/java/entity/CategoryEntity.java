/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "categories")
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcategories")
    private int id;
      
    @Column(name = "description")
    private String  description;
            
    @Column(name = "name")
    private String name;
    
    @OneToMany(mappedBy = "category" ,fetch = FetchType.LAZY)
    private  List<Bookentity> bookentitylist;

    
    
    
    public CategoryEntity() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Bookentity> getBookentitylist() {
        return bookentitylist;
    }

    public void setBookentitylist(List<Bookentity> bookentitylist) {
        this.bookentitylist = bookentitylist;
    }

    
   
    
    
}
