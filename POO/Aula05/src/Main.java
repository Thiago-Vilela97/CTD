public class Main {
    public static void main(String[] args) {

        UsuarioJogo usuario1 = new UsuarioJogo("Thiago", "Vilela");
        UsuarioJogo usuario2 = new UsuarioJogo("Stefanie", "Moura");

        usuario1.aumentarPontuacao();
        usuario1.aumentarPontuacao();
        usuario1.bonus(3);

        usuario2.subirNivel();
        usuario2.subirNivel();

        System.out.println(usuario1.getPontuacao());
        System.out.println(usuario2.getNivel());
    }
}