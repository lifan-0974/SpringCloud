package lllfff.com.feign;

import lllfff.com.entity.Student;
import lllfff.com.feign.impl.FeignErrot;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
@FeignClient(value = "provider",fallback = FeignErrot.class)
public interface FeignProvider {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();
    @GetMapping("/student/index")
    public  String index();
}
