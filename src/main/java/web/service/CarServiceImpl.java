package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", 2020, "White"));
        cars.add(new Car("Moskvich", 2024, "Black"));
        cars.add(new Car("Mercedes", 2019, "Blue"));
        cars.add(new Car("BMW", 2020, "Black"));
        cars.add(new Car("Ferrari", 2022, "Yellow"));
    }

    @Override
    public List<Car> getListOfCars() {
        return cars;
    }

}
