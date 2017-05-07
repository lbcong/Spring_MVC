package repository;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import entity.Bookentity;
import java.util.List;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
@Repository
public interface BookRepository extends CrudRepository<Bookentity, Integer>{
    List<Bookentity> findByAuthor(String author);
    List<Bookentity> findByNameAndAuthor(String author ,String name);
    List<Bookentity> findByNameOrAuthor(String name , String author);
    Bookentity findBybookdetailsIsbn(String isbn);
   
}
