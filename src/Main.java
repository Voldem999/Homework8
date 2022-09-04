public class Main {
    public static void checkYear(int year) {
    if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
        System.out.println(year + " г. не високосный");
    else System.out.println(year + " г. високосный");}

    public static void main(String[] args) {
        checkYear(2022);
    }}
