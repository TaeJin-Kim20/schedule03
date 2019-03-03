package tjkim.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tjkim.sample.service.SampleService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class SampleController {
    Logger log = LoggerFactory.getLogger(this.getClass());

    @Resource(name="sampleService")
    private SampleService sampleService;

    @RequestMapping(value="/sample/openSampleBoardList.do")
    public ModelAndView openSampleBoardList(Map<String,Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("/sample/boardList");

        List<Map<String,Object>> list = sampleService.selectBoardList(commandMap);
        mv.addObject("list", list);

        return mv;
    }

    @RequestMapping(value="/sample/openSampleList.do")
    public ModelAndView openSampleList(Map<String, Object> commandMa) {
        ModelAndView mv = new ModelAndView("/sample/openSampleList");
        log.debug("Test Interceptor");

        return mv;
    }
}
