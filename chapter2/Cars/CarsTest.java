package chapter2.Cars;


public class CarsTest {
    public static void main(String[] args) {
        Cars[] arrCars = Cars.listCars(2);

        for (int i = 0; i < arrCars.length; i++) {
            System.out.println(arrCars[i].getCarBand() + '\t' +
                    arrCars[i].getCarPrice() + '\t' + arrCars[i].getCarColor());
        }

    }
}
