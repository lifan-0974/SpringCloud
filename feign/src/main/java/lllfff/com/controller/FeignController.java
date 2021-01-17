package lllfff.com.controller;

import lllfff.com.entity.Student;
import lllfff.com.feign.FeignProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("feign")
public class FeignController {
    @Autowired
    private FeignProvider feignProvider;
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProvider.findAll();
    }
    @GetMapping("/index")
    public  String index(){
        return feignProvider.index();
    }
}
