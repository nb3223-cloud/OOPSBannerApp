public class OOPSBanner {

    public static void main(String[] args) {

        String[] banner = new String[] {
            buildLine(0),
            buildLine(1),
            buildLine(2),
            buildLine(3),
            buildLine(4),
            buildLine(5),
            buildLine(6)
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }

    static String buildLine(int row) {
        return String.join(" ",
                getO(row),
                getO(row),
                getP(row),
                getS(row));
    }

    static String getO(int row) {

        String[] O = {
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        };

        return O[row];
    }

    static String getP(int row) {

        String[] P = {
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*    ",
                "*    ",
                "*    "
        };

        return P[row];
    }

    static String getS(int row) {

        String[] S = {
                "*****",
                "*    ",
                "*    ",
                "*****",
                "    *",
                "    *",
                "*****"
        };

        return S[row];
    }
}