package main.fhj.seabattle;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess); // преобразуем тип String в int
        String result = "Мимо"; // создаем переменную для хранения резульата, который будем возвращать в случае промаха
        for (int cell : locationCells) { // повторяем с каждой ячейков из массива
            if (guess == cell) { // сравнение хода пользователя и элемента массива
                result = "Попал"; // при обнаружении попадания
                numOfHits++; // при обнаружении попадания
                break;
            }
        }
        if (numOfHits == locationCells.length) { // сравнение количества попаданий и длину массива
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }


}
