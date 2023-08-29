package semana21a;

// Tela cadastro nome, email, senha - Maria
// Classe inserir no banco - João


public interface CadastroUsuarioI {
    public boolean cadastro(String nome, String email, String senha);
}


class CadastroUsuarioFake implements CadastroUsuarioI {

    @Override
    public boolean cadastro(String nome, String email, String senha) {
        return false;
    }

}

class CadastroUsuario implements CadastroUsuarioI {

    @Override
    public boolean cadastro(String nome, String email, String senha) {
        // abrir conexao

        // montar o insert com nome, email e senha


        ///executar o insert

        // verificar se deu certo

        // retornar true ou false
        return false;
    }

}
