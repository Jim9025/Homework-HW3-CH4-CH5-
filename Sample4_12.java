public class Sample4_12 {
    public static void main(String[] args) {

        IVehicle[] ivc;
        ivc = new IVehicle[2];     // 準備介面的陣列

        ivc[0] = new Car(1234, 20.5);  // 第 1 個物件：Car 類別
        ivc[1] = new Plane(232);       // 第 2 個物件：Plane 類別

        for (int i = 0; i < ivc.length; i++) {
            ivc[i].show();             // 多型效果：依實際類別執行
        }
    }
}
