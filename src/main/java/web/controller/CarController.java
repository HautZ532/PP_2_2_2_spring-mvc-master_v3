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
    private final CarServiceImp carService;

    public CarController(CarServiceImp carService) {
        this.carService = carService;
    }


    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        List<Car> allCars = carService.getCarFromListByCount(count);
        model.addAttribute("messages", allCars);
        return "cars";
    }
}
