    public static ArrayList<String> searchAllFilesInCatalog(String pathWay) throws Exception {
        File folder = new File(pathWay);
        ArrayList<String> filesInCatalog = new ArrayList<>();
        if (!folder.exists()) {
            filesInCatalog.add("Exception! Way to catalog is Not Correct");
            return filesInCatalog;
        }
        return recursionToFindAllFilesInCatalog(folder, filesInCatalog);
    }

    public static  ArrayList<String> recursionToFindAllFilesInCatalog(File folder, ArrayList<String> filesInCatalog) {
        for (File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                recursionToFindAllFilesInCatalog(new File(fileEntry.getAbsolutePath()), filesInCatalog);
            }
            if (fileEntry.isFile()) {
                filesInCatalog.add(fileEntry.getName());
            }
        }
        return filesInCatalog;
    }
