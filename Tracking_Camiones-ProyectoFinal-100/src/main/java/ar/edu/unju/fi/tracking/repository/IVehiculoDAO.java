package ar.edu.unju.fi.tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unju.fi.tracking.model.Vehiculo;

/**
 * Se implementa la interfaz para bajar el acomplamiento
 * entre capas y se definen metodos para luego utilizarlos
 * @author Toconas Ulises
 */
public interface IVehiculoDAO extends JpaRepository<Vehiculo, Long> {

}
