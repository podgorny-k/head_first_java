package test.fhj.seabattle;

import main.fhj.seabattle.SimpleDotCom;

public class SimpleDotComTest {

    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom(); //создаем экземпляр класса SimpleDotCom
        int[] locations = {2, 3, 4}; // создаем массив для местоположения "сайта". 3 числа из 7.
        dot.setLocationCells(locations); // вызываем сеттер "сайта"
        String userGuess = "2"; // делаем ход от имени пользователя
        String result = dot.checkYourself(userGuess); // вызываем метод checkYourself объекта SimpleDotCom
    }
}
