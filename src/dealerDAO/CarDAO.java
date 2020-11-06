package dealerDAO;

import java.util.List;
	import javax.persistence.TypedQuery;
	import dealerPD.Car;
	
public class CarDAO {
	

	

		public static void addCar(Car car)
		{
			EM.getEM().persist(car);
		}
			
		public static void saveCar(Car car) {
			EM.getEM().persist(car);
			
		}

		public static List<Car> listCar()
		{
			TypedQuery<Car> query = EM.getEM().createQuery(
					"SELECT Car FROM Car Car", Car.class);
			return query.getResultList();
		}

		public static Car findCarById(int id)
		{
			Car car = EM.getEM().find(Car.class, id);
			return car;
		}
		
		public static void removeCar(Car Car)
		{
			EM.getEM().remove(Car);
		}
	}


