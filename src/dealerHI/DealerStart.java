package dealerHI;

import java.util.List;

import dealerDAO.DealerDAO;
import dealerDAO.EM;
import dealerPD.Dealer;


public class DealerStart {

  public static void main(String[] args) {
    
		EM.initEM();
		Dealer dealer;
		List<Dealer> dealers = DealerDAO.listDealer();
		if( dealers.isEmpty() ) {
			dealer = new Dealer();
			
		} 
		else 
		{
		dealer = dealers.get(0);
		}
		
    
    DealerFrame.open(dealer);

  }

}
