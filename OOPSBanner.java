/**
 * UC4 - Print OOPS Banner using String Array and Loop
 * Author: sysadmin
 * Version: 4.0
 */

public class OOPSBanner {

    public static void main(String[] args) {

        // Store banner lines in String array using String.join()
        String[] banner = {

            String.join(" ", "*****", "*****", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*   *", "*   *"),
            String.join(" ", "*   *", "*   *", "*   *", "*    "),
            String.join(" ", "*   *", "*****", "*****", "*****"),
            String.join(" ", "*   *", "*    ", "*    ", "    *"),
            String.join(" ", "*   *", "*    ", "*    ", "*   *"),
            String.join(" ", "*****", "*    ", "*****", "*****")

        };

        // Print banner using loop
        for (String line : banner) {
            System.out.println(line);
        }

    }
}