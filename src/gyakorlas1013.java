public class gyakorlas1013 {
    public static void main(String[] args) {
        //Deklarálj a main metódusodban egy 20 hosszú tömböt, amit tölts fel 1 és 100 közötti
        //random számokkal!
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println(sumOfEvenNumbers(numbers));
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

    // Írj egy metódust, ami kiszámolja, hogy a tömbben hány darab páratlan szám van!

    public static int countOddNumbers (int[] nums){
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 1){
                counter++;
            }
        }
        return counter;
    }

    public static int sumOfOddNumbers(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1){
                sum += numbers[i];
            }
        }
        return sum;
    }

    // Írj metódusod, ami kiszámolja a tömbben szerepló páros számok összegét!

    public static int sumOfEvenNumbers(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0){
                sum += numbers[i];
            }
        }
        return sum;
    }

}
