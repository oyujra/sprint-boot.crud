package com.jiska.jiskasoft.controllers;

import com.jiska.jiskasoft.models.Empleado;
import com.jiska.jiskasoft.repositories.EmpleadoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
    private final EmpleadoRepository empleadoRepository;

    public EmpleadoController(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @GetMapping
    public List<Empleado> getEmpleados() {
        return empleadoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Empleado> addEmpleado(@RequestBody Empleado empleado) {
        return ResponseEntity.status(HttpStatus.CREATED).body(empleadoRepository.save(empleado));
    }

    @PutMapping("/{ci}")
    public ResponseEntity<Empleado> updateEmpleado(@PathVariable String ci, @RequestBody Empleado empleado) {
        if (empleadoRepository.existsById(ci)) {
            empleado.setCi(ci);
            return ResponseEntity.ok(empleadoRepository.save(empleado));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{ci}")
    public ResponseEntity<Void> deleteEmpleado(@PathVariable String ci) {
        if (empleadoRepository.existsById(ci)) {
            empleadoRepository.deleteById(ci);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
