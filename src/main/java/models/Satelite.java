package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Data
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
    private long timestamp;
    @Column(name = "latitude")
    private double latitude;
    @Column(name = "longtitude")
    private double longtitude;

    @OneToMany(mappedBy = "satelit")
    private List<Astronaut> astronauts;



}
