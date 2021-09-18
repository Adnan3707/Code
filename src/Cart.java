public class Cart {
        private boolean engine;
        private int cylinders;
        private String name;
        private int wheels = 4;

    public Cart(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public void startEngine() {
            System.out.println("Car engine is starting");
        }

        public void accelerate() {
            System.out.println("Car is accelerating");
        }

        public void brake() {
            System.out.println("The Car is braking");
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCylinders() {
            return cylinders;
        }

        public String getName() {
            return name;
        }

    }

    class Mitsubishi extends Cart {


        public Mitsubishi(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public void startEngine() {
            System.out.println("Car engine is starting"+getName());
        }

        public void accelerate() {
            System.out.println("Car is accelerating"+getName()+"And Engine name is"+getCylinders());
        }

        public void brake() {
            System.out.println("The Car is braking"+getName()+"And Engine is "+getCylinders());
        }

    }

    class Holden extends Cart {


        public Holden(int cylinders, String name) {
            super(cylinders, name);
        }

        public void startEngine() {
            System.out.println("Car engine is starting"+getName());
        }

        public void accelerate() {
            System.out.println("Car is accelerating"+getName()+"And Engine name is"+getCylinders());
        }

        public void brake() {
            System.out.println("The Car is braking"+getName()+"And Engine is "+getCylinders());
        }
    }

    class Ford extends Cart {


        public Ford(int cylinders, String name) {
            super(cylinders, name);
        }
         @Override
        public void startEngine() {
            System.out.println("Car engine is starting "+getName()+" with "+getCylinders());
        }

        public void accelerate() {
            System.out.println("Car is accelerating"+getName()+"And Engine name is"+getCylinders());
        }

        public void brake() {
            System.out.println("The Car is braking"+getName()+"And Engine is "+getCylinders());
        }

        public static void main(String[] args) {
            Ford car = new Ford(8,"Mustang");
            car.startEngine();
            Holden car1 = new Holden(12,"Fararrie");
            car1.startEngine();
            /*  Cart car = new Cart(8,"Base car");
            System.out.println(car.startEngine());

           */
        }
    }
