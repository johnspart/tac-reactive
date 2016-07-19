/**
 * 
 */
package co.com.tac.repository;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import co.com.tac.cdi.TxInterceptorBinding;
import co.com.tac.dto.Area;
import co.com.tac.hibernate.HibernateUtil;
import co.com.tac.orm.TArea;
import rx.Observable;

/**
 * @author john
 *
 */
@Stateless
public class AreaRepository {

	private EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();

	@TxInterceptorBinding(readOnly = true)
	@SuppressWarnings("unchecked")
	public Observable<List<Area>> getAreas() {
		List<Area> areas = entityManager
				.createQuery(
						"SELECT new co.com.tac.dto.Area(areArea, areNombre, areEstado, tRolUsuario.usrUsuario) FROM TArea")
				.getResultList();
		Observable<List<Area>> now = Observable.just(areas);
		return now;
	}

	public void guardarArea(Area area) {
		this.entityManager.persist(new TArea(area));
	}

	public void actualizarArea(Area area) {
		this.entityManager.merge(new TArea(area));
	}

}
