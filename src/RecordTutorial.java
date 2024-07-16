import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public record RecordTutorial(String nome, int numeroCracha) {

    public static final Integer SALARIO = 1200;

    @Contract(pure = true)
    public @NotNull String upperCaseMessage() {
        return nome.toUpperCase();
    }
}
