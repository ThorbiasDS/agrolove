public abstract class Usuario {
    private String nome;
    private String login;
    private String senha;

    public Usuario(){

    }

    public Usuario(String nome, String login, String senha){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public boolean verificarSenha(String senha){
        return this.senha.equals(senha);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString(){
        return "Esse usuário possui nome: " + this.nome +
        ", login" + this.login;
    }
}
