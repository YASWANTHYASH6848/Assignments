package yaswanth.Model;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("app")
public class app {

    private  String name;
    private  String Desc;
    private String Url;

    public app() {
    }

    public app(String name, String desc, String url) {
        this.name = name;
        this.Desc = desc;
        this.Url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    @Override
    public String toString() {
        return "app{" +
                "name='" + name + '\'' +
                ", Desc='" + Desc + '\'' +
                ", Url='" + Url + '\'' +
                '}';
    }
}
