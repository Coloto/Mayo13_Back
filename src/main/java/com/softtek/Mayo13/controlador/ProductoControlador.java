package com.softtek.Mayo13.controlador;

import com.softtek.Mayo13.modelo.Producto;
import com.softtek.Mayo13.servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductoControlador {
    @Autowired
    ProductoServicio productoServicio;

    @GetMapping
    public List<Producto> consultaTodos(){
        System.out.println(productoServicio.obtenerTodos());
        return productoServicio.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Producto consultaUno(@PathVariable int id){
        return productoServicio.obtenerUno(id);
    }

    @PostMapping
    public Producto crear(@RequestBody Producto p){
        return productoServicio.crear(p);
    }

    @PutMapping
    public Producto modificar(@RequestBody Producto p){
        return productoServicio.actualizar(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id){
        productoServicio.eliminar(id);
    }
}
