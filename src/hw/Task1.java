package hw;

// 1. Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
// Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException
// с сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".


public class Task1 {
    public static void main(String[] args) {
        Task1 ex1 = new Task1();
        ex1.numCheck(2);
        ex1.numCheck(-3);
    }

    public void numCheck(int number) {
        try {
            if (isPositive(number)) {
                System.out.println("Число корректно " + number);
            } else {
                throw new Exceptions.InvalidNumberException("Число некорректно " + number);
            }
        } catch (Exceptions.InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean isPositive(int number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }
    }
}
