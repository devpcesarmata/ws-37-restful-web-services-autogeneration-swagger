package ws37restfulwebservicesautogenerationswagger.ws37restfulwebservicesautogenerationswagger;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

@SpringBootApplication
public class Ws37RestfulWebServicesAutogenerationSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ws37RestfulWebServicesAutogenerationSwaggerApplication.class, args);
	}
	
	@Bean
	public LocaleResolver localResolver() {
		AcceptHeaderLocaleResolver localResolver = new AcceptHeaderLocaleResolver();
		localResolver.setDefaultLocale(Locale.US);
		return localResolver;
	}
}