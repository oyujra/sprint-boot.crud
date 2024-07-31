package com.jiska.jiskasoft.repositories;

import com.jiska.jiskasoft.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, String> {
}
