    //3. расчёт длины списка, для которого разрешена только операция удаления первого элемента pop(0) (и получение длины конечно);
    public static int getLengthOfList (LinkedList list){
        try {
            list.pop();
        }
        catch (NoSuchElementException e){
            return 0;
        }
        return 1 + getLengthOfList(list);
    }


    //4. проверка, является ли строка палиндромом;
    // Наверное это самый примитивный способ проверки строки на палиндром. Дополнительно нужно учитывать будет ли одна буква определяться как палиндром или нет.
    // Также из самого явного возникают вопросы: влияет ли регистр на проверку и учитываются ли символьные знаки в строке (запятые, пробелы и т. п.) 
    // Тогда предварительные операции по обработкам этих условий имеет смысл выделить в отдельную функцию и уже потом вызывать рекурсивную функцию.

    public static boolean isStringPalindrome(String checkingString) {
        String string;
        try {
            string = checkingString.substring(1, checkingString.length() - 1);
        } catch (Exception e) {
            return true;
        }
        return checkingString.charAt(0) == checkingString.charAt(checkingString.length() - 1) && isStringPalindrome(string);
    }



