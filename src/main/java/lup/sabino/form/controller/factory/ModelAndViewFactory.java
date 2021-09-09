package lup.sabino.form.controller.factory;

import org.springframework.web.servlet.ModelAndView;

public class ModelAndViewFactory {

    private String viewName;

    public ModelAndViewFactory(String viewName){
        this.viewName = viewName;
    }

    public ModelAndView create(){
        return new ModelAndView(this.viewName);
    }
}
