class Sample5_5
{
    public static void main(String[] args) throws CarException
    {
        Car car1;
        car1 = new Car();

        car1.setCar(1234, -10.0);   // 速度(gas) 小於 0 會拋出 CarException

        car1.show();
    }
}
