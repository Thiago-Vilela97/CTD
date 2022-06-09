public class UsuarioJogo {
    private String name;
    private String nickname;
    private int pontuacao;
    private int nivel;

    public UsuarioJogo(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }
    public Integer getNivel() {
        return nivel;
    }

    public void aumentarPontuacao() {
        pontuacao++;
    }
    public void subirNivel() {
        nivel++;
    }
    public void bonus (Integer valor) {
        pontuacao += valor;
    }

}
