package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDaoImp;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private final CarDaoImp car = new CarDaoImp();

    {
        car.addCarInList(new Car("Audi", "A5", "NHT678KL"));
        car.addCarInList(new Car("Mazda", "6", "KYU983QV"));
        car.addCarInList(new Car("Nissan", "Almera", "PIT459sSD"));
        car.addCarInList(new Car("Toyota", "Camri", "REY943TH"));
        car.addCarInList(new Car("Lada", "Vesta", "NHT678KL"));
    }

    @Override
    public void addCarInList(Car car) {
        this.car.addCarInList(car);
    }

    @Override
    public List<Car> getCarFromListByCount(int count) {
        return car.getCarFromListByCount(count);
    }
}
