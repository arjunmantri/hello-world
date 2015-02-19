package hello

import org.springframework.context.annotation.{Configuration, ComponentScan}
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * This config class will trigger Spring @annotation scanning and auto configure Spring context.
 *
 * @author Arjun Mantri
 * @since 1.0
 */
//Need to know only Spring MVC to know for the assignments.
@Controller //Annotation to declare the dependencies.
@Configuration
@EnableAutoConfiguration
@ComponentScan //all de packages r scanned via dis.
class HelloConfig {

  @RequestMapping(value=Array("/"), method=Array(RequestMethod.GET))
  @ResponseBody
  def home(): String = "Hello World!"

}
