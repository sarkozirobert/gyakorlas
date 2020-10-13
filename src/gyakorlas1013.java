public class gyakorlas1013 {
    public static void main(String[] args) {
        //Deklarálj a main metódusodban egy 20 hosszú tömböt, amit tölts fel 1 és 100 közötti
        //random számokkal!
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
    }
}
