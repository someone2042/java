public class Tp3Exe13 {
    public static void main(String[] args) {

        String json = """
                {
                "name": "Aziz",
                "age": 40,
                "city": "Rabat"
                }
                """;
        System.out.println(json);
        // quextion2
        String value = "A";
        String result = switch (value) {
            case "A" -> "Apple";
            case "B" -> "Banana";
            default -> "Mango";
        };
        System.out.println(result); // Output: Apple
    }
}
