public class Sample4_6 {
    public static void main(String[] args) {

        Car cars[];          // 準備父類別陣列
        cars = new Car[2];

        cars[0] = new Car();     // 父類別物件
        cars[0].setCar(1234, 20.5);

        cars[1] = new RacingCar(); // 子類別物件
        cars[1].setCar(4567, 30.5);

        for(int i = 0; i < cars.length; i++) {
            cars[i].show();  // 多型 → 執行實際型別的方法
        }
    }
}
