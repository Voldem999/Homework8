public class Main {
//    public static void checkYear(int year) {
//        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
//            System.out.println(year + " год високосный");
//        else System.out.println(year + " год не високосный");
//    }
//    // Задача 1
//
//    public static void main(String[] args) {
//        checkYear(2022);}


    // Задача 2

    public static void printRecommendationVersionOs(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear >= 2015)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if (clientOS == 0 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        else if (clientOS == 1 && clientDeviceYear >= 2015)
            System.out.println("Установите версию приложения для Android по ссылке");
        else if (clientOS == 1 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        else System.out.println("Ваша версия OS не поддерживается");
    }

    public static void main(String[] args) {

        int clientOS = 0;
        int clientDeviceYear = 2018;
        printRecommendationVersionOs(clientOS, clientDeviceYear);
    }

    // Задача 3




}
