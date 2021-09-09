package lup.sabino.form.repository.adaptador;

import lup.sabino.form.model.Funcionario;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface DatabaseAccess {

    Funcionario save(Funcionario funcionario);

    List<Funcionario> findAll();

}
