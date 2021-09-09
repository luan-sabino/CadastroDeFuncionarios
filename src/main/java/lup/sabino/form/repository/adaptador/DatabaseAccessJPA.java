package lup.sabino.form.repository.adaptador;

import lup.sabino.form.model.Funcionario;
import lup.sabino.form.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DatabaseAccessJPA implements DatabaseAccess{

    private FuncionarioRepository funcionarioRepository;

    @Autowired
    public DatabaseAccessJPA(FuncionarioRepository repository){
        this.funcionarioRepository = repository;
    }

    @Override
    public Funcionario save(Funcionario funcionario){
        return this.funcionarioRepository.save(funcionario);
    }

    @Override
    public List<Funcionario> findAll() {
        return this.funcionarioRepository.findAll();
    }


}
