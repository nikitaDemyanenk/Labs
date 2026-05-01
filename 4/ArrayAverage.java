public class ArrayAverage {
    public static void main(String[] args) {
        Object[] arr = {1, 2, "три", 4, 5}; 
        int sum = 0;
        int count = 0;

        for (int i = 0; i <= arr.length; i++) {
            try {
                sum += (int) arr[i]; 
                count++;
            } catch (ClassCastException | NumberFormatException e) {
                System.err.println("ошибка: неверный тип данных.");
            } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Ошибка: Выход за границы массива!");
            }
        }

        if (count > 0) {
            System.out.println("Среднее арифметическое (из подходящих элементов): " + (double) sum / count);
        } 
    }
}