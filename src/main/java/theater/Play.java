package theater;

/**
 * Represents a theatre play with a name and a play type.
 *
 * <p>This class stores the play's title and its type (e.g. "tragedy", "comedy").
 *
 * @author CSC207
 * @version 1.0
 * @since 1.0
 */
public class Play {

    private String name;
    private String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
