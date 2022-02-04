package pro.sky.java.homeworks.course2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> numsEven = new ArrayList<>(List.of(1, 8, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList(List.of("cat", "dog", "dog", "dog", "sheep"));

        printOddNumbers(nums);
        printSortedUniqueEvenNumbers(numsEven);
        printUniqueWords(words);
        printDuplicatesNumber(words);
    }

    private static void printDuplicatesNumber(List<String> words) {
        System.out.println("printDuplicatesNumber: ");
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(words.size() - uniqueWords.size());
    }

    private static void printOddNumbers(List<Integer> nums) {
        System.out.println("printOddNumbers: ");
        nums.removeIf(e -> e % 2 == 0);
        System.out.println(nums);

//              var 2
        for (int num: nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void printSortedUniqueEvenNumbers(List<Integer> numsEven) {
        System.out.println("printSortedUniqueEvenNumbers: ");
        // Удаление нечетных чисел
        numsEven.removeIf(e -> e % 2 != 0);
        System.out.println(numsEven);
        // Сортировка по возрастанию
        numsEven.sort(Comparator.naturalOrder());
        System.out.println(numsEven);
        // Удаление дублей
        List<Integer> numsEvenTo = numsEven.stream().distinct().collect(Collectors.toList());
        System.out.println(numsEvenTo);

//              var 2
        Set<Integer> uniqueSortedNums = new TreeSet<>(numsEven);
        // TreeSet - сортировка по ключам

        for (int num: uniqueSortedNums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void printUniqueWords(List<String> words) {
        System.out.println("printUniqueWords: ");
        List<String> wordsPrint = words.stream().distinct().collect(Collectors.toList());
        System.out.println(wordsPrint);

        // var 2
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);

        // var 3 сохранили сортировку
//        Set<String> uniqueWordsSort = new LinkedHashSet<>(words);
//        System.out.println(uniqueWordsSort);

    }
}


