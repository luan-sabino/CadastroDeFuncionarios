package lup.sabino.form.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
public class Funcionario {

    @Transient
    private double salarioBase = 1000.00;

    @Id
    private String cpf;

    @Column(name="nome", nullable = false)
    private String nome;

    @Column(name="email", nullable = false)
    private String email;

    @Column(name="cargo", nullable = false)
    private String cargo;

    @Column(name="data_de_nascimento", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date data_de_nascimento;

    @Column(name="salario", nullable = false)
    private double salario;

    public Funcionario() {

    }

    public void setSalario() {
        String cargo = this.getCargo();

        switch(cargo){
            case "dummy":
                this.salario = this.salarioBase;
                break;
            case "almostadummy":
                this.salario = this.salarioBase * 1.5;;
                break;
            case "admin":
                this.salario = this.salarioBase * 4.5;;
                break;
        }
    }

}
