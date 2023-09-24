    public static ArrayList<String> searchAllFilesInCatalog(String pathWay) throws Exception {
        File folder = new File(pathWay);
        return  recursionToFindAllFilesInCatalog(folder);
    }

    public static  ArrayList<String> recursionToFindAllFilesInCatalog(File folder) {
        if (folder == null || folder.listFiles() == null){
            return new ArrayList<>();
        }
        ArrayList<String> allFiles = new ArrayList<>();
        for (File fileEntry : folder.listFiles()) {
            if (fileEntry.isFile()) {
                allFiles.add(fileEntry.getName());
            }
            else  {
                allFiles.addAll(recursionToFindAllFilesInCatalog(new File(fileEntry.getAbsolutePath())));
            }
        }
        return allFiles;
    }
