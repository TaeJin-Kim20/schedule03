package tjkim.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class SampleController {
    Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value="/sample/openSampleList.do")
    public ModelAndView openSampleList(Map<String, Object> commandMa) {
        ModelAndView mv = new ModelAndView("/sample/openSampleList");
        log.debug("Test Interceptor");

        return mv;
    }
}
