public enum Dias_Da_Semana {
    SUNDAY("Domingo", 1, 4),
    MONDAY("Segunda", 2, 4),
    TUESDAY("Terça", 3, 4),
    WEDNESDAY("Quarta", 4, 4),
    THURSDAY ("Quinta", 5, 4),
    FRIDAY("Sexta", 6, 4),
    SATURDAY("Sábado", 7, 4);

    public final String nomeEmPortugues;
    public final int valores;
    public final int quantidadePorMes;

    Dias_Da_Semana(String nomeEmPortugues, int valores, int quantidadePorMes) {
        this.nomeEmPortugues = nomeEmPortugues;
        this.valores = valores;
        this.quantidadePorMes = quantidadePorMes;
    }
}

