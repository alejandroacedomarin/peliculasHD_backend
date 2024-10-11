package models;
import net.sf.oval.constraint.MaxSize;
import net.sf.oval.constraint.MinSize;

import play.data.validation.Required;
import play.db.jpa.Model;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

public class Pelicula extends Model{
    @ManyToOne
    public Usuario user;

    String id;
    @Required
    @MaxSize(15)
    @MinSize(4)
    public String title;

    @Required
    @MaxSize(15)
    @MinSize(5)
    public String description;

    @Required
    @MaxSize(1000)
    public String valoration;



    public Pelicula(String id, String title, String description, String valoration) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.valoration = valoration;

    }

}
