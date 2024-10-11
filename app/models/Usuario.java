package models;
import net.sf.oval.constraint.MaxSize;
import net.sf.oval.constraint.MinSize;
import play.data.validation.Required;
import play.db.jpa.Model;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

public class Usuario extends Model{
    @OneToMany
    public List<Pelicula> pelis;
    String id;
    @Required
    @MaxSize(15)
    @MinSize(4)
    public String username;

    @Required
    @MaxSize(15)
    @MinSize(5)
    public String password;

    @Required
    @MaxSize(100)
    public String name;

    @Required
    @MaxSize(100)
    public String email;

    public Usuario(String id, String name, String password, String username, String email ) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.username = username;
        this.email = email;

    }

}
