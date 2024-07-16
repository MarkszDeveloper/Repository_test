public interface NewInterface {
    public void ler(String livro);

    public void escrever(String livro);
    
    public default void baixar(String livro) {
        System.out.println("Livro sendo baixado!");
    }
}
