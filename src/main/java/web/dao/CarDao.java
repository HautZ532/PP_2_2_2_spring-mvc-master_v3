package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    void setCar(Car car);

    List<Car> getCar();
}
