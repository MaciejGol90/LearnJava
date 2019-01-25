public class Home {
    public static void main(String[] args) {
    Tv nosy =new Tv(45, "Sony");
    Tv sama = new Tv(32, "Samsung");

        System.out.println(sama.getName() + " " +sama.getSize());
        System.out.println(nosy.getName() + " " +nosy.getSize());

        sama.getOnOff();
        sama.setOnOff(true);
        sama.getOnOff();

        Dog rex = new Dog();
        rex.speak();
        rex.setSize(15);
        System.out.println(rex.getSize());

    }
}
