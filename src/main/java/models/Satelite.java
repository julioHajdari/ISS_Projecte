package models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Satelite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id")
    private int id;
    @Column(name = "satelite_name")
    private String name ;
    @Column(name = "timestampe")
    private int timestamp;
    @Column(name = "latitude")
    private int latitude;
    @Column(name = "longtitude")
    private int longtitude;

    @OneToMany(mappedBy = "satelit")
    private List<Astronaut> astronauts;



}
