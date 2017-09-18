@PropertySources({@PropertySource(value = "classpath:application.properties")})
@SpringBootApplication
public class ApplicationEntry {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationEntry.class, args);
    }

}
