package web.service;

import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;

public class CarServiceImp implements CarService {
    private final CarDaoImp car = new CarDaoImp();


    @Override
    public void setCar(Car car) {
        this.car.setCar(car);
    }

    @Override
    public List<Car> getCar() {
        return car.getCar();
    }
}
