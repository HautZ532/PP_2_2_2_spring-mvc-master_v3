package web.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.AppConfig;
import web.config.WebConfig;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    CarServiceImp carService = new CarServiceImp();

    @GetMapping(value = "/cars")
    public String printCar(ModelMap model) {
//        Car car1 = new Car("Audi", "A5", "NHT678KL");
//        Car car2 = new Car("Mazda", "6", "KYU983QV");
//        Car car3 = new Car("Nissan", "Almera", "PIT459sSD");
//        Car car4 = new Car("Toyota", "Camri", "REY943TH");
//        Car car5 = new Car("Lada", "Vesta", "NHT678KL");
        carService.setCar(new Car("Audi", "A5", "NHT678KL"));
        carService.setCar(new Car("Mazda", "6", "KYU983QV"));
        carService.setCar(new Car("Nissan", "Almera", "PIT459sSD"));
        carService.setCar(new Car("Toyota", "Camri", "REY943TH"));
        carService.setCar(new Car("Lada", "Vesta", "NHT678KL"));
        List<Car> allCars = carService.getCar();


//        @RequestParam(value = "count", defaultValue = "5")
        model.addAttribute("messages", allCars);
        return "cars";
    }
}
