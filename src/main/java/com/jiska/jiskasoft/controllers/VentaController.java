package com.jiska.jiskasoft.controllers;

import com.jiska.jiskasoft.models.Venta;
import com.jiska.jiskasoft.repositories.VentaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venta")
public class VentaController {
    private final VentaRepository ventaRepository;

    public VentaController(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    @GetMapping
    public List<Venta> getVentas() {
        return ventaRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Venta> addVenta(@RequestBody Venta venta) {
        if (ventaRepository.existsById(venta.getId())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(null);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(ventaRepository.save(venta));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Venta> updateVenta(@PathVariable Long id, @RequestBody Venta venta) {
        if (ventaRepository.existsById(id)) {
            venta.setId(id);
            return ResponseEntity.ok(ventaRepository.save(venta));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVenta(@PathVariable Long id) {
        if (ventaRepository.existsById(id)) {
            ventaRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
