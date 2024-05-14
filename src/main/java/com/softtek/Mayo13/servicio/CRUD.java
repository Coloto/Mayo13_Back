package com.softtek.Mayo13.servicio;

import com.softtek.Mayo13.repositorio.IGenericoRepositorio;

import java.util.List;

public abstract class CRUD<T,ID> implements ICRUD<T, ID>{
    protected abstract IGenericoRepositorio<T, ID> getRepo();

    @Override
    public T crear(T t) {
        return getRepo().save(t);
    }

    @Override
    public T actualizar(T t) {
        return getRepo().save(t);
    }

    @Override
    public void eliminar(ID id) {
        getRepo().deleteById(id);
    }

    @Override
    public T obtenerUno(ID id) {
        return getRepo().findById(id).orElse(null);
    }

    @Override
    public List<T> obtenerTodos() {
        return getRepo().findAll();
    }
}
