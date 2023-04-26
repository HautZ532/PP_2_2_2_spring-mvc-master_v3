package web.service;

import web.model.Car;
import java.util.List;

public interface CarService {
    void addCarInList(Car car);
    List<Car> getCarFromListByCount(int count);
}
