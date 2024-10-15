package OToM_OR_MToO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import O_To_Many_OR_many_To_One.Merchant;

public class Find_byPhnoeandPassword 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select m from Merchant m where m.phno =?1 and m.password=?2");
		q.setParameter(1, 7008404037l);
		q.setParameter(2, "sumit@123");
		try {
			Merchant m = (Merchant) q.getSingleResult();
			System.out.println(m);
		} catch (NoResultException e) 
		{
			System.out.println("no record is present");
		}
		
		
	}

}
