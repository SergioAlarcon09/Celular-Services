package co.edu.uceva.celularservice.model.service;

import co.edu.uceva.celularservice.model.entities.Celular;

import java.util.List;

public interface ICelularService {
    List<Celular> listarCelular();
    void delete(Celular celular);  //Elimina un celular de la BD
    Celular save(Celular celular); //Guarda el celular y me retorna uno mismo
    Celular findById(Long id);   //Busca un celular por su id
    Celular update(Celular celular);  //Actualiza celular
}
