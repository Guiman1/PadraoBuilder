public class AdaptadorUSB implements USB {
    private final TecladoUSBC teclado;

    public AdaptadorUSB(TecladoUSBC teclado) {
        this.teclado = teclado;
    }

    @Override
    public String conectarUSB() {
        String sinal = teclado.conectarUSBC();
        return "[Adaptador USB-C -> USB] " + sinal;
    }
}