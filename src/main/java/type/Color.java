package type;

public enum Color {
    RED('r'),
    BLUE('b'),
    YELLOW('y'),
    GREEN('g'),
    CYAN('c'),
    MAGENTA('m');

    private final char character;

    Color(char character) {
        this.character = character;
    }

    public static Color getColor(char character){
        Color c = null;
        for (Color color: Color.values()) {
            if(color.character == character){
                c = color;
            }
        }
        return c;
    }

    @Override
    public String toString() {
        return String.valueOf(character);
    }
}
