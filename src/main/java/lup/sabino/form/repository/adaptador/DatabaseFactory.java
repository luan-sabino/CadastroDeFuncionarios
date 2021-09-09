package lup.sabino.form.repository.adaptador;

import lup.sabino.form.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class DatabaseFactory {

    @Autowired
    public FuncionarioRepository fr;

    public DatabaseFactory(FuncionarioRepository fr){
        this.fr = fr;
    }

    public DatabaseAccess create(){
        return new DatabaseAccessJPA(fr);
    }

}
