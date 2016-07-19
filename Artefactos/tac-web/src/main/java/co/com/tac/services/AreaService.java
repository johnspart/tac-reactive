package co.com.tac.services;

import java.util.List;

import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.inject.Inject;

import co.com.tac.dto.Area;
import co.com.tac.repository.AreaRepository;
import rx.Observable;

@Stateless
public class AreaService {
	@Inject
	private AreaRepository areaRepository;

	public Observable<List<Area>> obtenerAreas() {
		return this.areaRepository.getAreas();
	}

	public void almacenarArea(Area area) {
		/*
		 * if (this.areaRepository.existArea(area))
		 * this.areaRepository.actualizarArea(area); else
		 * this.areaRepository.guardarArea(area);
		 */
	}
}
