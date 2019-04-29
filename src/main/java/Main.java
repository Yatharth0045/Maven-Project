public class Main {
    public static void main(String[] args) {
        Addition add = new Addition(10, 20);
        System.out.println("Sum is : " + add.add());

        Subtraction sub = new Subtraction(50, 30);
        System.out.println("Diff is : " + sub.subtract());
    }
}
