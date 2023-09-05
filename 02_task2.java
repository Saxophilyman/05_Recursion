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
    public static boolean isStringPalindrome(String checkingString) {
        String string;
        try {
            string = checkingString.substring(1, checkingString.length() - 1);
        } catch (Exception e) {
            return true;
        }
        return checkingString.charAt(0) == checkingString.charAt(checkingString.length() - 1) && isStringPalindrome(string);
    }



