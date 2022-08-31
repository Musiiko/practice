package practice.task14;
/*  Задан файл с текстом на английском языке. Выделить все различные слова.
    Для каждого слова подсчитать частоту его встречаемости. Слова, отличаю-
    щиеся регистром букв, считать различными. Использовать класс HashMap.   */

import practice.task14.service.WordRateAnalyzer;

public class Main {
    public static void main(String[] args) {
        WordRateAnalyzer wordRateAnalyzer = new WordRateAnalyzer("C:\\Users\\Sergey\\NewJavaProject\\" +
                "practice\\src\\practice\\task14\\file.txt");
        wordRateAnalyzer.read();
        wordRateAnalyzer.printStats();
        System.out.println(wordRateAnalyzer);
    }

}
