//5. печать только чётных значений из списка;
    public static void printEvenValuesFromList(List<Integer> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.get(0) % 2 == 0) {
            System.out.println(arrayList.get(0));
        }
        arrayList.remove(0); // можно удалить 9 и 10 строку и вместо них использовать: printEvenValuesFromList(arrayList.subList(1, arrayList.size()));
        printEvenValuesFromList(arrayList);
    }


//6. печать элементов списка с чётными индексами;
