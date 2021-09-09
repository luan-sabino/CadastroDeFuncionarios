package lup.sabino.form.repository;

import lup.sabino.form.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, String> {

}
