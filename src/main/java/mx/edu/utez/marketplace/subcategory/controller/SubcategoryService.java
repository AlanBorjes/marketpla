package mx.edu.utez.marketplace.subcategory.controller;

import mx.edu.utez.marketplace.category.model.Category;
import mx.edu.utez.marketplace.subcategory.model.Subcategory;
import mx.edu.utez.marketplace.subcategory.model.SubcategoryRepository;
import mx.edu.utez.marketplace.utils.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.Optional;

//CRUD
@Service
@Transactional
public class SubcategoryService {
    @Autowired
    SubcategoryRepository subcategoryRepository;

    @Transactional(readOnly = true)
    public ResponseEntity<Message> findAll(){
        return new ResponseEntity<>(new Message("OK", false, subcategoryRepository.findAll()), HttpStatus.OK);
    }

    @Transactional(readOnly = true)
    public ResponseEntity<Message>  findById(long id){
        if( subcategoryRepository.existsById(id)){
            return new ResponseEntity<>(new Message("OK", false, subcategoryRepository.findById(id)), HttpStatus.OK);
        }
        return new ResponseEntity<>(new Message("la subcategoria no existe", true, subcategoryRepository.findById(id)), HttpStatus.BAD_REQUEST);
    }

    @Transactional(readOnly = true)
    public ResponseEntity<Message>  findBySubcategoriesByCategory(long id){
        if( subcategoryRepository.existsSubcategoriesByCategory_Id(id)){
            return new ResponseEntity<>(new Message("OK", false, subcategoryRepository.findAllByCategoryId(id)), HttpStatus.OK);
        }
        return new ResponseEntity<>(new Message("la categoría no tiene subcategorías", true, subcategoryRepository.findById(id)), HttpStatus.BAD_REQUEST);
    }

    @Transactional(rollbackFor = {SQLException.class})
    public  ResponseEntity<Message> save(Subcategory subcategory){
        Optional<Subcategory> existsCategory = subcategoryRepository.findByDescription(subcategory.getDescription());
        if(existsCategory.isPresent()){
            return new ResponseEntity<>(new Message("La Subcategoría ya existe", true, null), HttpStatus.BAD_REQUEST);
        }
        Subcategory savedSubCategory = subcategoryRepository.saveAndFlush(subcategory);
        return new ResponseEntity<>(new Message("Subcategoría registrada correctamente", false, savedSubCategory), HttpStatus.OK);
    }
    @Transactional(rollbackFor = {SQLException.class}) // si encuenra un error lo vuelve a hacer
    public ResponseEntity<Message> update(Subcategory subcategory){
        if(subcategoryRepository.existsById(subcategory.getId())){
            return new ResponseEntity<>(new Message("OK", false, subcategoryRepository.saveAndFlush(subcategory)), HttpStatus.OK);
        }return new ResponseEntity<>(new Message("La Subcategoría no existe", true, null), HttpStatus.BAD_REQUEST);
    }

}
