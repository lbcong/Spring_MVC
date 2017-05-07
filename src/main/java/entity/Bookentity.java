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
@Table(name = "bookmaster")
public class Bookentity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idbookmaster")
    private int id;

    @Column(name = "author")
    private String author;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade = {CascadeType.ALL})
    @PrimaryKeyJoinColumn
    private Bookdetailsentity bookdetails;

    @ManyToOne
    @JoinColumn(name = "idcategories")
    private CategoryEntity category;

    public Bookentity() {
    }

    public String toString() {
        return "book name :" + id
                + "\nauthor :" + author
                + "\ncategory :" + category.getName()
                + "\nIsbn :" + bookdetails.getIsbn()
                + "\nnumberofpage :" + bookdetails.getNumberofpage()
                + "\ndatepublish :" + bookdetails.getPublishdate();
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public Bookdetailsentity getBookdetails() {
        return bookdetails;
    }

    public void setBookdetails(Bookdetailsentity bookdetails) {
        this.bookdetails = bookdetails;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
