
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class MyCar implements ICar {

    private List<Car> cars;

    public int f1(List<Car> t) {
        cars = t;
        int totalRate = 0;
        for (Car car : cars) {
            totalRate += car.getRate();
        }
        return totalRate / cars.size();
    }

    public void f2(List<Car> t) {
        cars = t;
        if (cars.size() < 2) {
            return;
        }

        int minIndex = 0;
        int maxIndex = 0;
        int minRate = cars.get(0).getRate();
        int maxRate = cars.get(0).getRate();

        for (int i = 1; i < cars.size(); i++) {
            int rate = cars.get(i).getRate();
            if (rate < minRate) {
                minIndex = i;
                minRate = rate;
            }
            if (rate > maxRate) {
                maxIndex = i;
                maxRate = rate;
            }
        }

        Collections.swap(cars, minIndex, maxIndex);
    }

    public void f3(List<Car> t) {
        cars = t;
        Comparator<Car> comparator = Comparator.comparing(Car::getMaker)
                .thenComparing(Comparator.comparingInt(Car::getRate).reversed());
        Collections.sort(cars, comparator);
    }
}
