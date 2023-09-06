    //1. возведение числа N в степень M;
    public static int raiseNumberToPower(int numberToRaise, int powerNumber) {
        if (powerNumber == 0) return 1;
        return numberToRaise * raiseNumberToPower(numberToRaise, powerNumber - 1);
    }

    //2. вычисление суммы цифр числа;
    public static int getSumDigitsOfNumber (int number){
        if (number / 10 == 0) return number;
        return number % 10 + getSumDigitsOfNumber(number / 10);
    }
