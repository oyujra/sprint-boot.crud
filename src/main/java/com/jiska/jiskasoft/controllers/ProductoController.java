package com.jiska.jiskasoft.controllers;

import com.jiska.jiskasoft.models.Producto;
import com.jiska.jiskasoft.repositories.ProductoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    private final ProductoRepository productoRepository;

    public ProductoController(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @GetMapping
    public List<Producto> getProductos() {
        return productoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Producto> addProducto(@RequestBody Producto producto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productoRepository.save(producto));
    }

    @PutMapping("/{codigo}")
    public ResponseEntity<Producto> updateProducto(@PathVariable String codigo, @RequestBody Producto producto) {
        if (productoRepository.existsById(codigo)) {
            producto.setCodigo(codigo);
            return ResponseEntity.ok(productoRepository.save(producto));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Void> deleteProducto(@PathVariable String codigo) {
        if (productoRepository.existsById(codigo)) {
            productoRepository.deleteById(codigo);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
