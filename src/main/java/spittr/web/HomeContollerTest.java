package spittr.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by CharlesYang on 2018/7/3/003.
 */
public class HomeContollerTest {
    @Test
    public void testHomePage() throws Exception {
        HomeController homeController
                = new HomeController();
        MockMvc mockMvc =
                standaloneSetup(homeController).build();

        mockMvc.perform(get("/homepage")).andExpect(view().name("home"));
//        assertEquals("home", homeController.home());
    }

}
