package co.edu.uceva.celularservice.model.service;


import co.edu.uceva.celularservice.model.dao.CelularDao;
import co.edu.uceva.celularservice.model.entities.Celular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
La clase hace las operaciones CRUD de la entidad Celular e implementa los métodos de ICelularService
 */
@Service
public class CelularServiceImpl implements ICelularService{
    @Autowired
    CelularDao celularDao;

    /**
     * Listar Celulares
     */
    @Override
    public List<Celular> listarCelular() { return(List<Celular>) celularDao.findAll(); }

    /**
     * Eliminar Celular
     */
    @Override
    public void delete(Celular celular) { celularDao.delete(celular); }

    /**
     * Guardar Celular
     */
    @Override
    public Celular save(Celular celular) { return celularDao.save(celular); }

    /**
     * Buscar celular por id
     */
    @Override
    public Celular findById(Long id) { return celularDao.findById(id).orElse(null); }

    /**
     * Actualizar celular
     */
    @Override
    public Celular update(Celular celular) { return celularDao.save(celular); }
}
