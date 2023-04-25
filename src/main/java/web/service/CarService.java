package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    void setCar(Car car);
    List<Car> getCar();
}
