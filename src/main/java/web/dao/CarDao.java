package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    void addCarInList(Car car);

    List<Car> getCarFromListByCount(int count);
}
