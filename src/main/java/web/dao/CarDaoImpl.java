package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class CarDaoImpl implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(100, "Mercedes-Benz", "AMG"));
        cars.add(new Car(102, "BMW", "525"));
        cars.add(new Car(105, "Hyundai", "Sonata"));
        cars.add(new Car(205, "Audi", "Q5"));
        cars.add(new Car(204, "KIA", "K7"));
        cars.add(new Car(208, "Lada", "Vesta"));
        cars.add(new Car(207, "KIA", "K5"));
    }

    @Override
    public List<Car> listByCars(int countCar) {
        if (countCar > 1 && countCar < 5) {
            return cars.stream().limit(countCar).collect(Collectors.toList());
        }
        return cars;
    }

}


