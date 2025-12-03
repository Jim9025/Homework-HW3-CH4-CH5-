public class Sample4_1 {
    public static void main(String[] args) {

        RacingCar rccar1;
        rccar1 = new RacingCar();     // 建立子類別的物件

        rccar1.setCar(1234, 20.5);    // 呼叫從父類別繼承的方法
        rccar1.setCourse(5);          // 呼叫子類別新增的方法
    }
}
