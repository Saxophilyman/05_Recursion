//5. печать только чётных значений из списка;
    public static void printEvenValuesFromList(List<Integer> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        recursionForPrintEvenValuesFromList(0, arrayList);
    }
    
    public static void recursionForPrintEvenValuesFromList(int indexOfList, List<Integer> list){
        if (indexOfList == list.size()){
            return;
        }
        if (list.get(indexOfList) % 2 == 0) {
            System.out.println(list.get(indexOfList));
        }
        recursionForPrintEvenValuesFromList(indexOfList + 1, list);
    }
