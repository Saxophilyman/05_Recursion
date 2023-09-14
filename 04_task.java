7. нахождение второго максимального числа в списке 
    public static int findSecondMax(int[] array) {
        if (array.length <= 1) {
            return Integer.MIN_VALUE;
        }
        int max;
        int secondMax;
        if(array[0] > array[1]) {
            max = array[0];
            secondMax = array[1];
        } else {
            max = array[1];
            secondMax = array[0];
        }
        return recursionForFindSecondMax(max, secondMax, 2, array);

    }

    public static int recursionForFindSecondMax(int findMax, int findSecondMax, int index, int[] array) {
        if (index > array.length-1) return findSecondMax;
        if (array[index] >= findMax) {
            findSecondMax = findMax;
            findMax = array[index];
        }
        else if (array[index] > findSecondMax) {
            findSecondMax = array[index];
        }
        return recursionForFindSecondMax(findMax, findSecondMax, index + 1, array);
    }
