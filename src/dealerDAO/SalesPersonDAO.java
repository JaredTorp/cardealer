package dealerDAO;


import java.util.List;
import javax.persistence.TypedQuery;
import dealerPD.SalesPerson;

public class SalesPersonDAO {

	public static void addSalesPerson(SalesPerson salesPerson)
	{
		EM.getEM().persist(salesPerson);
	}
		
	public static void saveSalesPerson(SalesPerson salesPerson) {
		EM.getEM().persist(salesPerson);
		
	}

	public static List<SalesPerson> listSalesPerson()
	{
		TypedQuery<SalesPerson> query = EM.getEM().createQuery(
				"SELECT SalesPerson FROM SalesPerson SalesPerson", SalesPerson.class);
		return query.getResultList();
	}

	public static SalesPerson findSalesPersonById(int id)
	{
		SalesPerson salesPerson = EM.getEM().find(SalesPerson.class, id);
		return salesPerson;
	}
	
	public static void removeSalesPerson(SalesPerson salesPerson)
	{
		EM.getEM().remove(salesPerson);
	}
}
