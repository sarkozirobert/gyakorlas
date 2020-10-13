public class gyakorlas1013 {
    public static void main(String[] args) {
        //Deklarálj a main metódusodban egy 20 hosszú tömböt, amit tölts fel 1 és 100 közötti
        //random számokkal!
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println(maxNumber(numbers));
    }

    public static int findMinValue(int[] numbers) {
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }

    public static int evenNumberCounter(int[] numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                counter++;
            }
        }
        return counter;
    }

    // Írj egy metódust, ami kiszámolja tömbben szereplő számok maximumát!

    public static int maxNumber (int nums[]){
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
}
