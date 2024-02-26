package car;

public class Main {
    public static int DISTANCE = 100;
    public static int STEP = 2;
    public static void main(String[] args) {
       car.Car carA = new car.Car("Car A");
       car.Car carB = new car.Car("Car B");
       car.Car carC = new car.Car("Car C");
       Thread thread1 = new Thread(carA);
       Thread thread2 = new Thread(carB);
       Thread thread3 = new Thread(carC);
        System.out.println("DISTANCE: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}