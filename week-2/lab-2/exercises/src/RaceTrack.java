class RaceTrack {
    public static void main(String[] args) {
        Car c1 = new Car(2010, "NANO", 241.5);

        System.out.println("CURRENT STATUS OF CAR");
        System.out.println("Year of Manufacture: " + c1.getYear());
        System.out.println("Car Model: " + c1.getMake());
        System.out.println("Car Speed: " + c1.getSpeed() + " kmph");
        System.out.println("---------------------------------------");

        c1.Accelerate();

        System.out.println("CURRENT SPEED OF CAR: " + c1.getSpeed() + " kmph");
        System.out.println("---------------------------------------");

        c1.Accelerate(10);

        System.out.println("CURRENT SPEED OF CAR: " + c1.getSpeed() + " kmph");
        System.out.println("---------------------------------------");

        c1.Break(1024);

        System.out.println("CURRENT SPEED OF CAR: " + c1.getSpeed() + " kmph");
        System.out.println("---------------------------------------");

        // Car c2 = new Car();
    }
}
