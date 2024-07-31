package com.jiska.jiskasoft.repositories;

import com.jiska.jiskasoft.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
}
