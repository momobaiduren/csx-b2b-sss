package com.yh.csx.sss.core.properties;

import com.yh.csx.sss.core.constant.GlobalManager;
import java.util.List;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhanglong
 */
@Data
@Configuration
@ConfigurationProperties(prefix = GlobalManager.ROOT_PREFIX)
public class SssProperties {

    private SwaggerProperties swagger;

    private FtpProperties ftpProperties;

    private List<TemplateProperties> templates;

}
