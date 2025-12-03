public class Sample4_10 {
    public static void main(String[] args) {

        Vehicle[] vc = new Vehicle[2];   // 準備抽象類別的陣列

        vc[0] = new Car(1234, 20.5);     // 第 1 個物件：Car 類別
        vc[0].setSpeed(60);

        vc[1] = new Plane(232);          // 第 2 個物件：Plane 類別
        vc[1].setSpeed(500);

        for (int i = 0; i < vc.length; i++) {
            vc[i].show();                // 多型 → 呼叫各自版本的 show()
        }
    }
}
