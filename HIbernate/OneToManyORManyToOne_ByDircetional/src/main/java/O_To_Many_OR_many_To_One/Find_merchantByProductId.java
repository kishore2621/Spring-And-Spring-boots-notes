package O_To_Many_OR_many_To_One;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Find_merchantByProductId 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select m.merchant from Product m where m.id=?1");
		q.setParameter(1, 2);
	
		try {
			Merchant m = (Merchant) q.getSingleResult();
			System.out.println(m);
		} catch (NoResultException e) 
		{
			System.out.println("no record is present");
		}
		
		
	}

}
