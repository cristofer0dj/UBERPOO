class main {
    public static void main(S6tring[]
    arg){
        System.out.println
        ("inicnialisando....");
        System.out.println("Car....");
        Car car = new Car("AMQ123", new
        Account("Marvin Gonzales",
        "AND1235","gonzalito@gmail.com",
        "12365"));
        car.passenger = 4;
        car.printDataCar();

        System.out.println("uberx....");
        Uberx uberx = new uberx
        ("MKL1234", new Account("theresa
         galarga","jhl1234",
         "there@gmail.com", "12567"),
         "Totota","corolla");
         Uberx.printDataCar();

         System.out.println("uberx....");
        Uberblack uberblack = new uberblack
        ("MKwL1234", new Account("David
         Rosales","jhl1234",
         "daf@gmail.com", "125967"),
         "Nissan","corolla");
         Uberblack.printDataCar();ç

         System.out.println("uberx....");
        Uberpoool uberpool = new uberpool
        ("MQL1234", new Account("theresa
         galarga","jhl1234",
         "gonzal@gmail.com", "12067"),
         "Totota","corolla");
         Uberpoool.printDataCar();

         System.out.println("uberx....");
        Ubervan ubervan = new ubervan
        ("MNL1234", new Account("Cèsar Garcìa","1234",
         "there@gmail.com", "92567"),
         "Totota","corolla");
         Ubervan.printDataCar();
    }
}