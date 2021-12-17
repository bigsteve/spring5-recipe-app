package learn.thymeleaf.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UnitOfMeasure {

    @Id
    private Integer id;

    private String uom;

    private String descripton;

    public String getUom() {
        return uom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

}
