public class Sample4_13 {
    public static void main(String[] args) {

        Car car1 = new Car(1234, 20.5);
        car1.vShow();   // 來自 IVehicle 介面
        car1.mShow();   // 來自 IMaterial 介面
    }
}
