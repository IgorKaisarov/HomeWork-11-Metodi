public class Main {

    // Task 1

    public static void printYear(int year) {
        if (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " год является високосным");
        } else if (year > 1584) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println("Год не может быть меньше 1585");
        }
    }

    // Task 2

    public static void printMobile(int clientDeviceYear, int clientOS) {

        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println(" Установите версию приложения для Android по ссылке ");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println(" Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию для Android ");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию для iOS ");
        }

    }

    // Task 3

    public static int calculateDeliveryDays(int deliveryDistance) {

        if (deliveryDistance > 100) {
           return - 1;
        } else if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        }
        return 0;
    }

    public static void printCard(int deliveryDistance) {
        int days = calculateDeliveryDays(deliveryDistance);
        if (days == -1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + days);
        }

    }




    public static void main(String[] args) {

        // Task 1
        System.out.println(" Task 1 ");
        int year = 2025;
        printYear(year);

        // Task 2
        System.out.println(" Task 2 ");
        printMobile(2010, 0);

        // Task 3
        System.out.println(" Task 3 ");
        printCard(25);

    }
}