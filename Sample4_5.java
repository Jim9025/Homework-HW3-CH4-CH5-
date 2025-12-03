public class Sample4_5 {
    public static void main(String[] args) {

        Car car1;              // 父類別變數
        car1 = new RacingCar(); // 指向子類別物件（多型）

        car1.setCar(1234, 20.5);

        car1.show();   // 執行的是 RacingCar 覆寫後的 show()
    }
}
