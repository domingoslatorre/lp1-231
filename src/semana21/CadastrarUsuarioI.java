package semana21;

public interface CadastrarUsuarioI {
    public boolean cadastrar(String prontuario, String nome, String email);
}


class CadastrarUsuario implements CadastrarUsuarioI {

    @Override
    public boolean cadastrar(String prontuario, String nome, String email) {
        // acessar o mysql

        // montar o INSERT usando prontuario, nome e email

        // salvar na tabela

        // return true ou false
        return true;
    }

}

class CadastrarUsuarioFake implements CadastrarUsuarioI {

    @Override
    public boolean cadastrar(String prontuario, String nome, String email) {
        return false;
    }
}
