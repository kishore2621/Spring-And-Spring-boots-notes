package O_To_Many_OR_many_To_One;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ProductByBrand 
{

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select m from Product m where m.Brand =?1");
		q.setParameter(1, "mi");
		List<Product> l= q.getResultList();
		if(l.size()>0)
		{
			for (Product product : l) {
				System.out.println(product);
			}
		}
		else
		{
			System.out.println("invalid");
		}
		
		
	}
}
