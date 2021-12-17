/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.repositorio;

import Reto2_Web.interfaces.InterfaceClothe;
import Reto2_Web.modelo.Clothe;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class ClotheRepositorio {
    @Autowired
    private InterfaceClothe repository;

    public List<Clothe> getAll() {
        return repository.findAll();
    }

    public Optional<Clothe> getClothe(String reference) {

        return repository.findById(reference);
    }
    public Clothe create(Clothe clothe) {

        return repository.save(clothe);
    }

    public void update(Clothe clothe) {

        repository.save(clothe);
    }
    
    public void delete(Clothe clothe) {

        repository.delete(clothe);
    }
}
