package lup.sabino.form.controller;

import lup.sabino.form.controller.factory.ModelAndViewFactory;
import lup.sabino.form.model.Funcionario;
import lup.sabino.form.repository.FuncionarioRepository;
import lup.sabino.form.repository.adaptador.DatabaseAccess;
import lup.sabino.form.repository.adaptador.DatabaseFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class FuncionarioController {

    public FuncionarioRepository fr;

    public FuncionarioController(FuncionarioRepository fr){
        this.fr = fr;
    }

    private DatabaseAccess databaseActions(FuncionarioRepository fr) {
        return new DatabaseFactory(fr).create();
    }

    private ModelAndView modelAndViewRequest(String viewname){return new ModelAndViewFactory(viewname).create();}

    @ModelAttribute(value="funcionario")
    public Funcionario funcionario(){
        return new Funcionario();
    }

    @GetMapping("/index")
    public ModelAndView index(){
        return modelAndViewRequest("index");
    }

    @GetMapping(value="/cadastro")
    public ModelAndView cadastroFunc(){
        return modelAndViewRequest("cadastrar_funcionario");
    }

    @GetMapping(value = "/lista_funcionarios")
    public ModelAndView lista_func(Model model) {
        return modelAndViewRequest("lista_funcionarios");
    }

    @PostMapping(value="/cadastrar_funcionario")
    public String cadastrarFuncionarios(@ModelAttribute("funcionario") Funcionario funcionario){
        funcionario.setSalario();
        databaseActions(fr).save(funcionario);
        return "redirect:/index";
    }

    @GetMapping(value="get_funcionarios")
    public String getFuncionariosDaDB(Model model){
        List<Funcionario> listaDeFuncionarios= fr.findAll();
        if(listaDeFuncionarios != null){
            model.addAttribute("lista_funcionarios",listaDeFuncionarios);
        }
        return "/lista_funcionarios";
    }



}
