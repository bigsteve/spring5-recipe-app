package learn.thymeleaf.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UnitOfMeasure {
    
    @Id
    @OneToOne(mappedBy = "ingredient")
    private Integer id;
    
    private String uom;

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }
    

}
