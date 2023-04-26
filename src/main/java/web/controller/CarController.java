package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.List;

@Controller
public class CarController {


    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        CarServiceImp carService = new CarServiceImp();
        carService.addCarInList(new Car("Audi", "A5", "NHT678KL"));
        carService.addCarInList(new Car("Mazda", "6", "KYU983QV"));
        carService.addCarInList(new Car("Nissan", "Almera", "PIT459sSD"));
        carService.addCarInList(new Car("Toyota", "Camri", "REY943TH"));
        carService.addCarInList(new Car("Lada", "Vesta", "NHT678KL"));
        List<Car> allCars = carService.getCarFromListByCount(count);
        model.addAttribute("messages", allCars);
        return "cars";
    }
}
