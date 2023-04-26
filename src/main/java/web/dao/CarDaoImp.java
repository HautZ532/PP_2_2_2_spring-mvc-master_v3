package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {

    private final List<Car> listCar = new ArrayList<>();

    @Override
    public void addCarInList(Car car) {
        listCar.add(car);
    }

    @Override
    public List<Car> getCarFromListByCount(int count) {
        if (count >= 5) return listCar;
        return listCar.stream().limit(count).collect(Collectors.toList());
    }
}
