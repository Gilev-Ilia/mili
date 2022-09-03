public class Main {
    public static void main(String[] args) {

        int ticket = 5000; // стоимость билета
        int mile = 20; // цена одной мили
        int miles = ticket / mile; // количество бонусных миль

        System.out.println(miles + " бонусных(ая) миль(я)");
    }
}