package GRP66.example.ITPMProject3Y2SemLifeBelowWaterRestAPI;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ItpmProject3Y2SemLifeBelowWaterRestApiApplication.class);
	}

}
