/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import entity.Bookdetailsentity;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;


public interface BookDetailsRepository extends CrudRepository<Bookdetailsentity, Integer>{
    
}
