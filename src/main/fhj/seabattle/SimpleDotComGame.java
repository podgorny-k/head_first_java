package main.fhj.seabattle;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0; // количество ходов пользователя
        GameHelper helper = new GameHelper(); // спец.класс для приема пользовательского ввода
        SimpleDotCom theDotCom = new SimpleDotCom(); // создание объекта "сайт"

        int randomNum = (int) (Math.random() * 5); // рандом число от 0 до 4
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations); // передача "сайту" местоположение его ячеек в массиве
        boolean isAlive = true; // проверка не закончилась ли игра

        while (isAlive) {
            String guess = helper.getUserInput("Введите число"); // получаем строку вводимую пользователем
            String result = theDotCom.checkYourself(guess); // проверяем полученные данные
            numOfGuesses++;
            if (result.equals("Потопил")) { // проверяем потоплен ли сайт
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
            }
        }
    }
}
