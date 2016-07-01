/**
 * 
 */
package co.com.tac.repository;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import co.com.tac.dto.Area;
import co.com.tac.orm.TArea;
import co.com.tac.repository.utils.GenericRepository;

/**
 * @author john
 *
 */
@Singleton
public class AreaRepository extends GenericRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Area> getAreas() {
		return DetachedCriteria.forClass(TArea.class, "ARE").setProjection(TArea.tAreaToArea("ARE"))
				.getExecutableCriteria(this.entityManager.unwrap(Session.class)).list();
	}

	public void guardarArea(Area area) {
		this.entityManager.persist(new TArea(area));
	}

	public void actualizarArea(Area area) {
		this.entityManager.merge(new TArea(area));
	}

	public boolean existArea(Area area) {
		DetachedCriteria dCriteria = DetachedCriteria.forClass(TArea.class, "ARE");
		dCriteria.add(Restrictions.eq("ARE.", area.getCodigo()));
		return super.findDetachedCriteriaExist(this.entityManager, dCriteria);
	}

}
