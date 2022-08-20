import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static String firstName = "Семён ";
    public static String middleName = "Семёнович ";
    public static String lastName = "Иванов ";
    public static String fullName = lastName + firstName + middleName;

    public static String oneString = "135";
    public static String twoString = "246";
    public static String abraCadabra = "aabccddefgghiijjkk";

    private static void task1() {
        System.out.println("Task1");
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println();
    }

    private static void task2() {
        System.out.println("Task2");
        System.out.println("ФИО сотрудника - " + fullName.toUpperCase());
        System.out.println();
    }

    private static void task3() {
        System.out.println("Task3");
        System.out.println("ФИО сотрудника - " + fullName.replace('ё', 'е'));
        System.out.println();
    }

    private static void task4() {
        System.out.println("task4");
        int x = fullName.indexOf(' ');
        int y = fullName.indexOf(' ', x+2);
        int z = fullName.lastIndexOf(' ');

        firstName = fullName.substring(x+1, y);
        lastName = fullName.substring(0, x);
        middleName = fullName.substring(y+1, z);

        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
        System.out.println();
    }

    private static void task5() {
        System.out.println("task5");
        fullName = fullName.toLowerCase();
        String[] array = fullName.split(" ");
        for (String str : array) {
            char[] chars = str.toCharArray();
            char character = chars[0];
            character = Character.toUpperCase(character);
            chars[0] = character;
            String build = String.valueOf(chars) + " ";
            System.out.print(build);
        }
        System.out.println("\n");
    }
   /* Задание 6
    Имеется две строки.
    Первая: "135"
    Вторая: "246"
    Соберите из двух строк одну, содержащую данные "123456".
    Использовать сортировку нельзя.
    Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
    Выведите результат в консоль в формате: “Данные строки — ….”
            :sos: Подсказка
    Следует использовать StringBuilder.
            Критерии оценки
– Применен метод, меняющий написание данных строки.
– При изменении содержания строки результат программы выполняется.
– Результат программы выведен в консоль согласно условиям задачи.*/
    private static void task6() {
        System.out.println("task6");

        String[] array = oneString.split("");
        String[] arr = twoString.split("");
        for (int i = 0; i < array.length && i < arr.length; i++) {
            int a = Integer.parseInt(array[i]+arr[i]);
                System.out.print(a);
        }
        System.out.println("\n");
    }

    /*Задание 7
    Дана строка из букв английского алфавита "aabccddefgghiijjkk".
    Нужно найти и напечатать буквы, которые дублируются в строке.
    Обратите внимание, что строка отсортирована, т. е. дубли идут друг за другом.
    В итоге в консоль должен быть выведен результат программы: "acdgijk".
    Критерии оценки
– Данные в строке отсортированы корректно.
– При изменении содержания строки результат программы выполняется.
– Результат программы выведен в консоль согласно условиям задачи.*/
    private static void task7() {
        System.out.println("task7");
        char[] array = abraCadabra.toCharArray();
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] == array[i+1]) {
                build.append(array[i]);
            }
        }
        System.out.println(build);
    }
}