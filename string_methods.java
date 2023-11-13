public class string_methods {
    public static void main(String[] args) {
        String name = "Datt";
        String Channal = "Datt Bhatt";
        System.out.println(name);

        System.out.println(name + " from " + Channal);

        System.out.println(name.length());

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name + " from\" " + Channal);
        System.out.println(name + " from\\ " + Channal);
        System.out.println(name + " from\t " + Channal);
        System.out.println(name + " from\' " + Channal);
        System.out.println(name + " from\n " + Channal);

        System.out.println(name.contains("Dat"));
        System.out.println(name.charAt(1));
        System.out.println(name.endsWith("tt"));
        System.out.println(name.indexOf("Datt"));
    }
}
