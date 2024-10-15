package O_To_Many_OR_many_To_One;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		Merchant  m = new Merchant();
		m.setName("sumit");
		m.setEmail("sumitpatel074610@sumit.com");
		m.setPhno(7008404037l);
		m.setPassword("sumit@123");
		m.setGst_number("gkppp5411r");
		
		Product p1 = new Product();
		p1.setName("laptop");
		p1.setCategory("electornics");
		p1.setBrand("mi");
		p1.setMerchant(m);
		
		Product p2 = new Product();
		p2.setName("bulb");
		p2.setCategory("electornics");
		p2.setBrand("mi");
		p2.setMerchant(m);
		
		Product p3 = new Product();
		p3.setName("mobile phone");
		p3.setCategory("electornics");
		p3.setBrand("mi");
		p3.setMerchant(m);
		
		
		m.setProducts(Arrays.asList(p1,p2,p3));
		em.persist(m);
		trans.commit();
		
	}

}
