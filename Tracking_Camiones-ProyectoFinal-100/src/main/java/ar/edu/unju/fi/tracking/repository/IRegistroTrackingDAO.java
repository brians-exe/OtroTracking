package ar.edu.unju.fi.tracking.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unju.fi.tracking.model.Localidad;
import ar.edu.unju.fi.tracking.model.RegistroTracking;

/**
 * Se implementa la interfaz para bajar el acomplamiento
 * entre capas y se definen metodos para luego utilizarlos
 * @author Toconas Ulises
 */
public interface IRegistroTrackingDAO extends JpaRepository<RegistroTracking, Long> {
	
	//buscar registro por patente de vehiculo
	List<RegistroTracking> findByVehiculoPatente(String patente);
	
	//buscar registro entre un rango de fechas y localidad ordenado por fecha
	public List<RegistroTracking> findByFechaBetweenAndLocalidadOrderByFecha(LocalDate fechaDesde, LocalDate fechaHasta, Localidad localidad);
}
