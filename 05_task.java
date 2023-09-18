    //8. Поиск всех файлов в заданном каталоге, включая файлы, расположенные в подкаталогах произвольной вложенности.
    //Для хождения по директориям используйте стандартную функцию. Результат выдавайте списком, List например.
    public static ArrayList<String> searchAllFilesInCatalog(String pathWay) throws Exception {
        File folder = new File(pathWay);
        ArrayList<String> filesInCatalog = new ArrayList<>();
        if (!folder.exists()) {
            filesInCatalog.add("Exception! Way to catalog is Not Correct");
            return filesInCatalog;
        }
        recursionToFindAllFilesInCatalog(folder, filesInCatalog);
        return filesInCatalog;
    }

    public static void recursionToFindAllFilesInCatalog(File folder, ArrayList<String> filesInCatalog) {
        for (File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                recursionToFindAllFilesInCatalog(new File(fileEntry.getAbsolutePath()), filesInCatalog);
            }
            if (fileEntry.isFile()) {
                filesInCatalog.add(fileEntry.getName());
            }
        }
    }
