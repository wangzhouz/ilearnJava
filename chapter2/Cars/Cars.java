package chapter2.Cars;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Cars {
    private String CarBand;
    private int CarPrice;
    private String carColor;

    public Cars() {
    }

    public Cars(String carBand, int carPrice, String carColor) {
        this.CarBand = carBand;
        this.CarPrice = carPrice;
        this.carColor = carColor;
    }

    public String getCarBand() {
        return CarBand;
    }

    public void setCarBand(String carBand) {
        CarBand = carBand;
    }

    public int getCarPrice() {
        return CarPrice;
    }

    public void setCarPrice(int carPrice) {
        CarPrice = carPrice;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public static Cars[] listCars(int listNumber) {
        Scanner sc = new Scanner(System.in);
        Cars[] arr = new Cars[listNumber];

        for (int i = 0; i < arr.length; i++) {
            Cars car = new Cars();
            System.out.println("请输入第" + (i + 1) + "车的品牌");
            car.setCarBand(sc.next());
            System.out.println("请输入第" + (i + 1) + "车的价格");
            car.setCarPrice(sc.nextInt());
            System.out.println("请输入第" + (i + 1) + "车的颜色");
            car.setCarColor(sc.next());
            arr[i] = car;
        }
        return arr;
    }
}
