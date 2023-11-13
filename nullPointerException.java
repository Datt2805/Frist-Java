class nullPointerException {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.toUpperCase());
        } catch (Exception e) {
            System.out.println("null can't be casted");
        }
    }
}
