package tjkim.sample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import tjkim.sample.dao.SampleDAO;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("sampleService")
public class SampleServiceImpl implements SampleService {
    Logger log = LoggerFactory.getLogger(this.getClass());

    @Resource(name="sampleDAO")
    private SampleDAO sampleDAO;

    @Override
    public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception {

        return sampleDAO.selectBoardList(map);

    }
}
