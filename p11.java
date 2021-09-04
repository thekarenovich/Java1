public class Test {
    public static void main(String[] args) {

        Dog obj1 = new Dog(3, "Teo");
        System.out.println("Age and Name:" + " " + obj1.getAge()
        + obj1.getName());

        Ball obj2 = new Ball();
        System.out.println("Quantity of ball is" + " " + obj2.getQuantity());

        Book obj3 = new Book(3, 'y');
        System.out.println("Age and Name:" + " " + obj3.getQuality() + " " +
                + obj3.getColor() + " " + obj3.getQuantity());
    }
}
