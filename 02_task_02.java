    //3. расчёт длины списка, для которого разрешена только операция удаления первого элемента pop(0) (и получение длины конечно);
    public static int getLengthOfList (LinkedList list){
        if (list.size() == 0){
            return 0;
        }
        list.pop();
        return 1 + getLengthOfList(list);
    }


    //4. проверка, является ли строка палиндромом;
    public static boolean isStringPalindrome(String checkingString) {
        if (checkingString.length() <= 1) return true;
        return checkingString.charAt(0) == checkingString.charAt(checkingString.length() - 1)
                && isStringPalindrome(checkingString.substring(1, checkingString.length() - 1));
    }

