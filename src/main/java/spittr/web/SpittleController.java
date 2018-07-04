package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spittr.data.Spittle;
import spittr.data.SpittrRepository;

import java.util.List;

/**
 *
 * Created by CharlesYang on 2018/7/3/003.
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {

    private SpittrRepository spittrRepository;

    @Autowired
    public SpittleController(SpittrRepository spittrRepository){
        this.spittrRepository = spittrRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Spittle> spiitles(){
        return spittrRepository.findSpittles(Long.MAX_VALUE, 20);
    }
}
