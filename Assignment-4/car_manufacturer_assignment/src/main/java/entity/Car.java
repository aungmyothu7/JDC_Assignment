package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String Model;
    private String  Make;
    private int year;
    private int millage;

    @OneToMany(mappedBy = "car")
    List<Owner> ownerList = new ArrayList<>();

    @OneToOne
    private InsuranceCompany insuranceCompany;

    @ManyToOne
    private Driver driver;


}
