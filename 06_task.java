//  9.Генерация всех корректных сбалансированных комбинаций круглых скобок
    public static ArrayList<String> generationCombinationsOfAllBracketsBalanced(int countOfOpenBrackets) {
        ArrayList<String> variationsOfAllCombinations = new ArrayList<>();
        recursionForGenerationCombinationsOfAllBracketsBalanced(countOfOpenBrackets, 0, 0, new StringBuilder(), variationsOfAllCombinations);
        return variationsOfAllCombinations;
    }


    public static void recursionForGenerationCombinationsOfAllBracketsBalanced
            (int countOfOpenBrackets, int openBracket, int closeBracket, StringBuilder stringCombination, ArrayList<String> arrayToRecordCombinations) {
        if (openBracket == countOfOpenBrackets && closeBracket == countOfOpenBrackets) {
            arrayToRecordCombinations.add(stringCombination.toString());
            return;
        }
        if (openBracket < countOfOpenBrackets) {
            recursionForGenerationCombinationsOfAllBracketsBalanced
                    (countOfOpenBrackets, openBracket + 1, closeBracket, new StringBuilder(stringCombination + "("), arrayToRecordCombinations);
        }
        if (closeBracket < openBracket){
            recursionForGenerationCombinationsOfAllBracketsBalanced
                    (countOfOpenBrackets, openBracket, closeBracket +1, new StringBuilder(stringCombination + ")"), arrayToRecordCombinations);
        }
    }
