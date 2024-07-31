package com.jiska.jiskasoft.controllers;

import com.jiska.jiskasoft.models.Cliente;
import com.jiska.jiskasoft.repositories.ClienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public List<Cliente> getClientes() {
        return clienteRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Cliente> addCliente(@RequestBody Cliente cliente) {
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteRepository.save(cliente));
    }

    @PutMapping("/{nit}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable String nit, @RequestBody Cliente cliente) {
        if (clienteRepository.existsById(nit)) {
            cliente.setNit(nit);
            return ResponseEntity.ok(clienteRepository.save(cliente));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{nit}")
    public ResponseEntity<Void> deleteCliente(@PathVariable String nit) {
        if (clienteRepository.existsById(nit)) {
            clienteRepository.deleteById(nit);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
