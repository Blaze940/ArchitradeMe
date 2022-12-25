package kernel;

public interface Command {
    default String name() {
        return getClass().getSimpleName();
    }
}
