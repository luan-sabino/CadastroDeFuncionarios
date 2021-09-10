package lup.sabino.form.controller.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ModelAndViewFactoryTest {

    @Test
    void testFactoryCreate(){
        ModelAndViewFactory factory = new ModelAndViewFactory("nameOfView");
        Assertions.assertEquals("nameOfView", factory.create().getViewName());
    }

}
