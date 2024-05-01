public class Main {
    public static void main(String[] args) {
        // Створення об'єкту класу Exception
        Exception myException = new Exception(10, "hello");

        // Виклик методу firstExceptions()
        System.out.println("Виклик методу firstExceptions():");
        myException.firstExceptions();

        System.out.println(); // Додатковий рядок для розділення виведених повідомлень
        // Виклик методу secondExceptions()
        System.out.println("Виклик методу secondExceptions():");
        myException.secondExceptions();
        System.out.println();
        System.out.println("Виклик методу thirdExceptions():");
        myException.thirdException();
        Exception fx = new Exception(1, "hey");
        fx.thirdException();
    }
}
