package com.jiska.jiskasoft.repositories;

import com.jiska.jiskasoft.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, String> {
}
