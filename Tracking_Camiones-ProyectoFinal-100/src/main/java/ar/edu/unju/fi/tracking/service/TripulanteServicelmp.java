package ar.edu.unju.fi.tracking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.tracking.model.Tripulante;
import ar.edu.unju.fi.tracking.repository.ITripulanteDAO;

/**
 * Esta clase ultiza la anotacion @Repository para manejar las instancias de los objetos  
 * de la clase e implementa los metodos de la interfaz ITripulanteService para poder
 * utilizarlos luego para manipular los datos 
 * @author Toconas Ulises
 */
@Repository
public class TripulanteServicelmp implements ITripulanteService {

	@Autowired
	ITripulanteDAO tripulanteDAOImp;
	
	@Override
	public void guardarTripulante(Tripulante tripulante) {
		// TODO Auto-generated method stub
		tripulanteDAOImp.save(tripulante);
	}

	@Override
	public List<Tripulante> obtenerTripulantes() {
		// TODO Auto-generated method stub
		return tripulanteDAOImp.findAll();
	}

	@Override
	public Optional<Tripulante> obtenerUnTripulante(Long id) {
		// TODO Auto-generated method stub
		return tripulanteDAOImp.findById(id);
	}

	@Override
	public void eliminarTripulante(Long id) {
		// TODO Auto-generated method stub
		tripulanteDAOImp.deleteById(id);
	}

}
