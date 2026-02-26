public class OOPSBannerApp{

    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Create banner array
        String[] banner = new String[7];

        // Build banner line by line
        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("  ",
                    oPattern[i],
                    oPattern[i],
                    pPattern[i],
                    sPattern[i]);
        }

        // Print using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Method to generate O pattern
    public static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };
    }

    // Method to generate P pattern
    public static String[] getPPattern() {
        return new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    // Method to generate S pattern
    public static String[] getSPattern() {
        return new String[]{
                "  *****  ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                "  *****  "
        };
    }
}