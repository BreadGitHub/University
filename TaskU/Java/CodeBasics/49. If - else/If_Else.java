public class If_Else {
    
    public static String normalizeUrl(String site) {
        if (site.startsWith("https://")) {
            return site;
        }

        return "https://" + site;
    }
}