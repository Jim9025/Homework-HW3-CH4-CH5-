public class Sample4_7 {
    public static void main(String[] args) {

        Car car1;
        car1 = new Car();

        car1.setcar(1234, 20.5);
        System.out.println(car1);   // 會自動呼叫 car1.toString()
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

    public void setcar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設定為" + num + "，汽油量設為" + gas);
    }

    // 覆寫 Object 類別的 toString()
    public String toString() {
        String str = "車號:" + num + "，汽油量:" + gas;
        return str;
    }
}
