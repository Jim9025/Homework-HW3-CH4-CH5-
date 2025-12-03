class Car
{
    private int num;
    private double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("已產生了汽車");
    }

    // 宣告此方法可能會拋出 CarException
    public void setCar(int n, double g) throws CarException
    {
        if (g < 0)
        {
            CarException e = new CarException();
            throw e;   // g 小於零 → 拋出例外
        }
        else
        {
            num = n;
            gas = g;
            System.out.println("將車號設為" + num + "，汽油量設為" + gas);
        }
    }

    public void show()
    {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}
