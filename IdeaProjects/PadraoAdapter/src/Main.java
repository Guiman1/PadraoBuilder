 public static void main(String[] args) {
        TecladoUSBC teclado = new TecladoUSBC();
        Gabinete gabinete = new Gabinete();

        USB adaptador = new AdaptadorUSB(teclado);
        gabinete.conectar(adaptador);
}