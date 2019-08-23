package wang.ismy.ssm;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import wang.ismy.ssm.config.Config;

/**
 * @author MY
 * @date 2019/8/23 11:31
 */
public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{Config.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
