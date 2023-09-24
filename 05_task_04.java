    public static ArrayList<String> recursionToFindAllFilesInCatalog(String pathWay) {
        File folder = new File(pathWay);
        if (!folder.exists() || folder.listFiles() == null) {
            return new ArrayList<>();
        }
        ArrayList<String> allFiles = new ArrayList<>();
        for (File fileEntry : folder.listFiles()) {
            if (fileEntry.isFile()) {
                allFiles.add(fileEntry.getName());
            } else {
                allFiles.addAll(recursionToFindAllFilesInCatalog(fileEntry.getAbsolutePath()));
            }
        }
        return allFiles;
    }
