package lup.sabino.form.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class FuncionarioTest {

    @Test
    void TestaSetSalarioDoFuncionario(){
        Funcionario funcionario = new Funcionario();
        funcionario.setCargo("dummy");
        funcionario.setSalario();
        Assertions.assertEquals(1000, funcionario.getSalario());
    }

}
