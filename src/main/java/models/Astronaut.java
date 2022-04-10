package models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import respositories.SatelitRepository;

import javax.persistence.*;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Astronaut {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "full_name")
    private String name ;
    @Column(name = "satelite_id")
    protected int sateliteId;


    @ManyToOne
    @JoinColumn(name = "satelite_id",updatable = false,insertable = false,unique = true)
    public Satelite satelit;
}
