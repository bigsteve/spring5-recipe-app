package learn.thymeleaf.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripton;
    private Integer prepTimeInteger;
    private Integer cookTimeInteger;
    private Integer servingsInteger;
    private String source;
    private String url;
    private String directions;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Ingredient> ngredient;

    @Lob
    private Byte[] image;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Notes notes;
    // TODO: add
    // private Difficulty difficulty;

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    public Integer getPrepTimeInteger() {
        return prepTimeInteger;
    }

    public void setPrepTimeInteger(Integer prepTimeInteger) {
        this.prepTimeInteger = prepTimeInteger;
    }

    public Integer getCookTimeInteger() {
        return cookTimeInteger;
    }

    public void setCookTimeInteger(Integer cookTimeInteger) {
        this.cookTimeInteger = cookTimeInteger;
    }

    public Integer getServingsInteger() {
        return servingsInteger;
    }

    public void setServingsInteger(Integer servingsInteger) {
        this.servingsInteger = servingsInteger;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

}
