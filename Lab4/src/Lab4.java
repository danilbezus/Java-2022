import java.util.Arrays;
import java.util.Comparator;

public class Lab4 {
    public static void main(String[] args) {
        /*
        0302
        C11 = 5 -> Визначити клас одяг, який складається як мінімум з 5-и полів.
        */

        String jacketColor = "Black";
        String jacketCountry = "Germany";

        Clothes Jacket = new Clothes("Jacket", "M", "Spring", jacketColor, jacketCountry);
        Clothes Sneakers = new Clothes("Sneakers", "41", "Summer", "White", "Ukraine");
        Clothes Pants = new Clothes("Pants", "L", "Autumn", "Grey", "Poland");

        Clothes[] clothes = {Jacket, Sneakers, Pants};
        //сортування одягу за кольором
        Arrays.sort(clothes, Comparator.comparing(Clothes::getColor));

        System.out.println("Sorted by color");
        for (Clothes item : clothes) {
            PrintClothesParameters(item);
        }

        //обернене сортування за країною-виробнком
        System.out.println("Sorted by country reversed");
        Arrays.sort(clothes, Comparator.comparing(Clothes::getCountry).reversed());
        for (Clothes item : clothes) {
            PrintClothesParameters(item);
        }
    }

    private static void PrintClothesParameters(Clothes item) {
        System.out.println();
        System.out.println("name of the clothes: " + item.getName());
        System.out.println("size of the clothes: " + item.getSize());
        System.out.println("season of the clothes: " + item.getSeason());
        System.out.println("color of the clothes: " + item.getColor());
        System.out.println("country of the clothes: " + item.getCountry());
        System.out.println();
    }

}