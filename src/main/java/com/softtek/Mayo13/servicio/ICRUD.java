package com.softtek.Mayo13.servicio;

import java.util.List;

public interface ICRUD<T, ID> {
    T crear(T t);
    T actualizar(T t);
    void eliminar(ID id);
    T obtenerUno(ID id);
    List<T> obtenerTodos();
}
