package ma.lnet;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class GlobalReposConfig extends RepositoryRestConfigurerAdapter {
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.setReturnBodyOnCreate(true);
		config.setReturnBodyOnUpdate(true);
		config.getCorsRegistry()
			.addMapping("/**")
			.allowedOrigins("http://localhost:4200")
			.allowedHeaders("*")
			.allowedMethods("GET","POST");
	}

}
