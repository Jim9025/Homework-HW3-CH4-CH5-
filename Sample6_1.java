class Sample6_1
{
    public static void main(String[] args)
    {
        Car car1 = new Car("1號車");
        car1.start();   // 啟動新執行緒

        for (int i = 0; i < 5; i++)
        {
            System.out.println("正在執行main()的處理工作");
        }
    }
}

class Car extends Thread   // 繼承 Thread 類別
{
    private String name;

    public Car(String nm)
    {
        name = nm;
    }

    public void run()   // 覆寫 run()，執行緒啟動後會執行這裡
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("正在執行" + name + "的處理工作");
        }
    }
}
