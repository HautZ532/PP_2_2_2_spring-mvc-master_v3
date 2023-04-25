package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    List<Car> listCar = new ArrayList<>();

    @Override
    public void setCar(Car car) {
        listCar.add(car);
    }

    @Override
    public List<Car> getCar() {
        return listCar;
    }
}
