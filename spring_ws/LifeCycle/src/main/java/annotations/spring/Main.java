package annotations.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("annotations.spring")
public class Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);
		ChatService cs = ctx.getBean(ChatService.class);
		cs.chat();
		ctx.close();
	}

}
