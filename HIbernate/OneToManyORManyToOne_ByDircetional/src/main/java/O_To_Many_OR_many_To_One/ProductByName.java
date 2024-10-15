package O_To_Many_OR_many_To_One;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ProductByName 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select m from Product m where m.name =?1");
		q.setParameter(1, "laptop");
		try {
			Product m = (Product) q.getSingleResult();
			System.out.println(m);
		} catch (NoResultException e) 
		{
			System.out.println("no record is present");
		}
		
		
	}

}
