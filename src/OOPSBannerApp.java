public class OOPSBannerApp {
    public static void main(String[] args) {

        String[] bannerParts = new String[7];

        bannerParts[0] = String.join("", "  *****      *****      *****     ******");
        bannerParts[1] = String.join("", " *     *    *     *    *     *    *     ");
        bannerParts[2] = String.join("", " *     *    *     *    *     *    *     ");
        bannerParts[3] = String.join("", " *     *    *     *    *****      ******");
        bannerParts[4] = String.join("", " *     *    *     *    *               *");
        bannerParts[5] = String.join("", " *     *    *     *    *               *");
        bannerParts[6] = String.join("", "  *****      *****     *          ******");

        
        for (String line : bannerParts) {
            System.out.println(line);
        }
    }
}