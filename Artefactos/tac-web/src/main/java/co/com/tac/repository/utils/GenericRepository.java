/**
 * 
 */
package co.com.tac.repository.utils;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projection;
import org.hibernate.transform.ResultTransformer;

/**
 * @author john
 *
 */
public class GenericRepository {

	@SuppressWarnings("unchecked")
	public <Z> List<Z> findDetachedCriteria(EntityManager entityManager, Class<Z> clazz,
			DetachedCriteria detachedCriteria, ResultTransformer resultTransformer, Projection projection) {

		this.setProjection(detachedCriteria, projection, resultTransformer);

		Criteria executableCriteria = detachedCriteria.getExecutableCriteria(entityManager.unwrap(Session.class));

		return ((List<Z>) executableCriteria.list());
	}

	@SuppressWarnings("unchecked")
	public <Z> Z findDetachedCriteriaUniqueResult(EntityManager entityManager, Class<Z> clazz,
			DetachedCriteria detachedCriteria, ResultTransformer resultTransformer, Projection projection) {

		this.setProjection(detachedCriteria, projection, resultTransformer);

		Criteria executableCriteria = detachedCriteria.getExecutableCriteria(entityManager.unwrap(Session.class));
		executableCriteria.setMaxResults(1);
		return (Z) executableCriteria.uniqueResult();
	}

	public boolean findDetachedCriteriaExist(EntityManager entityManager, DetachedCriteria detachedCriteria) {
		Criteria criteria = detachedCriteria.getExecutableCriteria(entityManager.unwrap(Session.class));
		criteria.setMaxResults(1);
		return criteria.uniqueResult() != null;

	}

	private void setProjection(DetachedCriteria detachedCriteria, Projection projection,
			ResultTransformer resultTransformer) {
		if (projection != null)
			detachedCriteria.setProjection(projection);
		if (resultTransformer != null)
			detachedCriteria.setResultTransformer(resultTransformer);
	}
}
