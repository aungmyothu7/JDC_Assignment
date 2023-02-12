package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String name;
    private Date dob;

    @OneToMany
    List<Car> owner_carlist = new ArrayList<>();

    public Driver() {
    }

    public Driver(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }
}
