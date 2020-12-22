package figur;
/*В отдельном пакете figur нужно создать структуру классов и имплементировать необходимые методы.
Должен быть базовый абстрактный класс и его наследники.
Все функции должны быть реализованы.
В классе Main с главным методом main должно быть реализовано задание.

Описание класов:
Создать структуру классов для круга, квадрата и треугольника. Каждый из них должен иметь следующие свойства (private) и методы (public)
- имя
- координаты
- функцию получения координат
- функцию расчета площади

Задание
В функции main должны быть рeализованы следующие пункты:
- создания массива рандомных фигур размером в 10 элементов.
- сортировка фигур по площади (ASC/DESC - не важно)
- вывести отсортированный массив на консоли в виде : Имя, S=площадь*/

import java.util.Random;

public class Main {
    public static void main(String[] args) {

    }
    public static void createFiguresArray() {

        Figure[] figures = new Figure[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {

            int x = random.nextInt(2 + 1);
            switch (x) {
                case 0:
                    Circle circle = new Circle();
                    break;
                case 1:
                    Square square = new Square();
                    break;
                case 2:
                    Triangle triangle = new Triangle();


            }
        }
    }
    public static void sortingArrayByArea(Figure[] arr) {

        //Bubble sorter
        /*for (int i = 0; i < array.length - 1; i++) {
            for (int j = (array.length - 1); j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }*/
    }
    }
