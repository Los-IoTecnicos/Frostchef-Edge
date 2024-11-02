package upc.losiotecnicos.domain.repository;

import upc.losiotecnicos.domain.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, Long> {
}