/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.repositorio;

import Reto2_Web.interfaces.Interfaceclothe;
import Reto2_Web.modelo.clothe;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class clotheRepositorio {
    @Autowired
    private Interfaceclothe repository;

    public List<clothe> getAll() {
        return repository.findAll();
    }

    public Optional<clothe> getClothe(String reference) {

        return repository.findById(reference);
    }
    public clothe create(clothe clothe) {

        return repository.save(clothe);
    }

    public void update(clothe clothe) {

        repository.save(clothe);
    }
    
    public void delete(clothe clothe) {

        repository.delete(clothe);
    }
}
