/**
 * @author Drumstyle92
 * class that contains the core of the program.
 */
public class Tester {
    /**
     * @param args main parameter.
     * main method which contains Strings, string methods, booleans and output.
     */
    public static void main(String[] args) {

        String veryLongString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        // string modification.
        veryLongString.replace("um","HUM");
        // division of the string
        String[] cut = veryLongString.split("aliquip");
        String sub1 = cut[0];
        String sub2 = cut[1];

        System.out.println("----------------------------------String1-------------------------------------");
        System.out.println(sub1.trim());
        System.out.println("----------------------------------String2-------------------------------------");
        System.out.println(sub2.trim());
        System.out.println("----------------------------------boolean-------------------------------------");
        System.out.println(" Comparison in XOR: " + (sub1.contains("est") ^ sub2.contains("est")));
    }
}
