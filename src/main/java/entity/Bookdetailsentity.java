/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.*;
import java.util.Date;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "bookdetails")
public class Bookdetailsentity {

    @Column(name = "numberofpage")
    private Integer numberofpage;
    @Column(name = "price")
    private Integer price;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idbookdetails")
    private int id;

    @Column(name = "isbn")
    private String isbn;

    
    @Column(name = "publishdate")
    @Temporal(TemporalType.DATE)
    private Date publishdate;

    @OneToOne(mappedBy = "bookdetails")
    private Bookentity book;
    
    public Bookdetailsentity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public Date getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Date publishdate) {
        this.publishdate = publishdate;
    }

    public Bookentity getBook() {
        return book;
    }

    public void setBook(Bookentity book) {
        this.book = book;
    }

    public Integer getNumberofpage() {
        return numberofpage;
    }

    public void setNumberofpage(Integer numberofpage) {
        this.numberofpage = numberofpage;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    
    

}
