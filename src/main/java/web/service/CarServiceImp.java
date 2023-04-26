package web.service;

import web.dao.CarDaoImp;
import web.model.Car;
import java.util.List;

public class CarServiceImp implements CarService {
    private final CarDaoImp car = new CarDaoImp();


    @Override
    public void addCarInList(Car car) {
        this.car.addCarInList(car);
    }

    @Override
    public List<Car> getCarFromListByCount(int count) {
        return car.getCarFromListByCount(count);
    }
}
