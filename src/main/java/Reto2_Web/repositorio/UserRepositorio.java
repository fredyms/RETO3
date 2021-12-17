/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.repositorio;

import Reto2_Web.interfaces.InterfaceUser;
import Reto2_Web.modelo.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author USUARIO
 */
@Repository
@AllArgsConstructor
public class UserRepositorio {

    private InterfaceUser interfaceUser;

    public List<User> getAll() {
        return (List<User>) interfaceUser.findAll();
    }

    public Optional<User> getUser(int id) {
        return interfaceUser.findById(id);
    }

    public User create(User user) {
        return interfaceUser.save(user);
    }

    public void update(User user) {
        interfaceUser.save(user);
    }

    public void delete(User user) {
        interfaceUser.delete(user);
    }

    public boolean emailExists(String email) {
        Optional<User> usuario = interfaceUser.findByEmail(email);

        return !usuario.isEmpty();
    }

    public Optional<User> authenticateUser(String email, String password) {
        return interfaceUser.findByEmailAndPassword(email, password);
    }

    public Optional<User> lastUserId() {
        return interfaceUser.findTopByOrderByIdDesc();
    }

}
