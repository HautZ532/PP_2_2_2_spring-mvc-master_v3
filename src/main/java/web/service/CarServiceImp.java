package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private final CarDao car;

    public CarServiceImp(CarDao car) {
        this.car = car;
    }

    @Override
    public List<Car> getCarFromListByCount(int count) {
        return car.getCarFromListByCount(count);
    }
}
