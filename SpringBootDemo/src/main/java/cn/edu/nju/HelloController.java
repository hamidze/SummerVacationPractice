package cn.edu.nju;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Thpffcj on 2017/7/26.
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

//    @RequestMapping(value = {"/say/{id}", "/hi"}, method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public String say(@PathVariable("id") Integer id) {
//        return girlProperties.getCupSize();
        return "id: " + id;
    }
}
