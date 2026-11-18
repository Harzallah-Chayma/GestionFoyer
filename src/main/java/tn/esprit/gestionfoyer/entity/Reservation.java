package tn.esprit.gestionfoyer.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idReservation;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;
    private boolean estValide;
    @ManyToOne
    @JsonIgnore
    private Chambre chambre;
    @ManyToMany(mappedBy = "reservations")
    @JsonIgnore
    private Set<Etudiant> etudiants;
}
