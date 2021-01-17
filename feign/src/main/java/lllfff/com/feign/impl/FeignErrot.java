package lllfff.com.feign.impl;

import lllfff.com.entity.Student;
import lllfff.com.feign.FeignProvider;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component
public class FeignErrot implements FeignProvider {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器正在维护......";
    }
}
