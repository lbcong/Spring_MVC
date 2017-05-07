/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import entity.*;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import entity.CategoryEntity;
import java.util.List;
/**
 *
 * @author Asus
 */
public interface CategoryRepository extends CrudRepository<CategoryEntity, Integer>{
    CategoryEntity findByName(String name);
}
