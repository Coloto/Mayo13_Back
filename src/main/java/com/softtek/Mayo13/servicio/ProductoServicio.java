package com.softtek.Mayo13.servicio;

import com.softtek.Mayo13.modelo.Producto;
import com.softtek.Mayo13.repositorio.IGenericoRepositorio;
import com.softtek.Mayo13.repositorio.IProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicio extends CRUD<Producto, Integer> implements IProductoServicio {
    @Autowired
    private IProductoRepositorio repo;

    @Override
    protected IGenericoRepositorio<Producto, Integer> getRepo() {
        return repo;
    }
}
