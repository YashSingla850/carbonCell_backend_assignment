package com.backendAssignment.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@OpenAPIDefinition(info = @Info(title = "carbon cell", description = " backendAssignment", summary = "contains authcontroller , homeController, api controller and etherum controller", contact = @Contact(name = "yash", email = "yashg3104@gmail.com"), version = "v1"

)

)

@SecurityScheme(name = "authBearer", in = SecuritySchemeIn.HEADER, type = SecuritySchemeType.HTTP, bearerFormat = "Jwt", scheme = "bearer", description = "jwt authorization"

)

public class SwaggerConfig {

}
