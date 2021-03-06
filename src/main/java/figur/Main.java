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
import java.util.concurrent.TimeUnit;

public class Main {
    //I didn't catch how to make RefreshButton to work well so added here this variable: to try dispose method etc
    DrawShapes drawShapes;

    public DrawShapes getDrawShapes() {
        return drawShapes;
    }

    public static void main(String[] args) throws InterruptedException {
        //creating array of not crossing 10 random figures
        Main main = new Main();
        Figure[] array = main.createFiguresArray(10, 0);
        Figure[] sortedArray = sortingArrayByArea(array);
        showArray(sortedArray);

        //draw figures in app
        main.startDrawApp(sortedArray);
    }

    //method of creating figures array with parameters : size of array and variable offset by x coordinate- in order not to cross figures
    public Figure[] createFiguresArray(int size, double offset) {

        Figure[] figures = new Figure[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {

            int x = random.nextInt(2 + 1);
            switch (x) {
                case 0:
                    Circle circle = new Circle(offset);
                    figures[i] = circle;
                    break;
                case 1:
                    Square square = new Square(offset);
                    figures[i] = square;
                    break;
                case 2:
                    Triangle triangle = new Triangle(offset);
                    figures[i] = triangle;
                default:
            }
            offset += 190;
        }
        return figures;
    }

    public static Figure[] sortingArrayByArea(Figure[] arr) {

        //Bubble sorter
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = (arr.length - 1); j > i; j--) {
                if (arr[j - 1].getArea() > arr[j].getArea()) {
                    Figure temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void showArray(Figure[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

    public void startDrawApp(Figure[] figure) {
        drawShapes = new DrawShapes(figure);
    }

    public void updateUI() {
        drawShapes.p.updateUI();
    }
}
