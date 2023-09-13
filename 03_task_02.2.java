    //6. печать элементов списка с чётными индексами;
    public static void printElementsWithEvenIndexFromList(List<Integer> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        recursionForPrintElementsWithEvenIndexFromList(0, arrayList);
    }

    public static void recursionForPrintElementsWithEvenIndexFromList(int indexOfList, List<Integer> list){
        if (indexOfList >= list.size()){
            return;
        }
            System.out.println(list.get(indexOfList));
        recursionForPrintElementsWithEvenIndexFromList(indexOfList + 2, list);
    }
