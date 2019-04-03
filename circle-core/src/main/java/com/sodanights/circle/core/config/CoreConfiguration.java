

package com.sodanights.circle.core.config;

import com.sodanights.circle.core.common.InternalEventBus;
import javax.annotation.Resource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;
import com.sodanights.circle.client.common.util.EnvUtil;


/**
 * Created by zhangyan on 27/03/2018.
 */
@Configuration
@ComponentScan(basePackages = {
        "com.sodanights.circle.core",
        "com.sodanights.circle.dal"
})
public class CoreConfiguration {

    @Bean
    public InternalEventBus internalEventBus() {
        return new InternalEventBus();
    }

    @Bean
    public EnvUtil envUtil(@Value("${env}") Integer env,@Value("${env-name}") String envName) {
        EnvUtil envUtil = new EnvUtil();
        envUtil.setEnv(env);
        envUtil.setEnvName(envName);
        return envUtil;
    }


}
