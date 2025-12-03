public class Sample4_9 {
    public static void main(String[] args) {

        Car[] cars;
        cars = new Car[2];

        cars[0] = new Car();        // 第 1 個物件：Car 類別
        cars[1] = new RacingCar();  // 第 2 個物件：RacingCar 類別

        for(int i = 0; i < cars.length; i++) {
            Class c = cars[i].getClass();   // getClass() 回傳物件的實際類別
            System.out.println("第 " + (i+1) + " 個物件的類別是 " + c);
        }
    }
}

class Car {

    protected int num;
    protected double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }
}

class RacingCar extends Car {

    private int course;

    public RacingCar() {
        course = 0;
        System.out.println("生產了賽車");
    }
}
