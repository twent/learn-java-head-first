public class BeerSong {
    public static void main (String[] args) {
        int beerBottles = 99;
        String word = "бутылок (бутылки)";

        while (beerBottles > 0) {
            if (beerBottles == 1) {
                word = "бутылка";
            }

            System.out.println(beerBottles + " " + word + " пива на стене");
            System.out.println(beerBottles + " " + word + " пива");
            System.out.println("Возьми одну");
            System.out.println("Пусти по кругу");
            beerBottles = beerBottles - 1;
        }

        if (beerBottles == 0) {
                System.out.println("Нет бутылок пива на стене");
        }

    }
}