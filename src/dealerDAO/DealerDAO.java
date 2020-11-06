package dealerDAO;

import java.util.List;
import javax.persistence.TypedQuery;
import dealerPD.Dealer;

public class DealerDAO {

	public static void addDealer(Dealer dealer)
	{
		EM.getEM().persist(dealer);
	}
		
	public static void saveDealer(Dealer dealer) {
		EM.getEM().persist(dealer);
		
	}

	public static List<Dealer> listDealer()
	{
		TypedQuery<Dealer> query = EM.getEM().createQuery(
				"SELECT dealer FROM dealer dealer", Dealer.class);
		return query.getResultList();
	}

	public static Dealer findDealerById(int id)
	{
		Dealer Dealer = EM.getEM().find(Dealer.class, id);
		return Dealer;
	}
	
	public static void removeDealer(Dealer dealer)
	{
		EM.getEM().remove(dealer);
	}
}