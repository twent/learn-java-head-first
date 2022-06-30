public class PhraseGenerator {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B",
                "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma",
                "critical-path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", 
                "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", 
                "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency",
                "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};

        int firstListLength = wordListOne.length;
        int secondListLength = wordListTwo.length;
        int thirdListLength = wordListThree.length;

        // Получаем случайное ЦЕЛОЧИСЛЕННОЕ значение
        int rand1 = (int) (Math.random() * firstListLength);
        int rand2 = (int) (Math.random() * secondListLength);
        int rand3 = (int) (Math.random() * thirdListLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];  

        System.out.println("Всё, что нам нужно - " + phrase);
    }
}