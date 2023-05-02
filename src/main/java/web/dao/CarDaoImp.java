package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    private final List<Car> listCar = new ArrayList<>();

    {
        listCar.add(new Car("Audi", "A5", "NHT678KL"));
        listCar.add(new Car("Mazda", "6", "KYU983QV"));
        listCar.add(new Car("Nissan", "Almera", "PIT459sSD"));
        listCar.add(new Car("Toyota", "Camri", "REY943TH"));
        listCar.add(new Car("Lada", "Vesta", "NHT678KL"));
    }

    @Override
    public List<Car> getCarFromListByCount(int count) {
        if (count >= 5) {
            return listCar;
        }
        return listCar.stream().limit(count).toList();
    }
}
