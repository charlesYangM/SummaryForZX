package org.summary.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.summary.model.Book;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by CharlesYang on 2018/3/8.
 */
@Controller
@RequestMapping("/json")
public class BookController {
    private static final Log logger = LogFactory.getLog(BookController.class);

    @RequestMapping("/testRequestBody")
    public void setJson(@RequestBody Book book,
                        HttpServletResponse response
    ) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        logger.info(mapper.writeValueAsString(book));
        book.setAuthor("yang");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(mapper.writeValueAsString(book));
    }
}
