package com.travelExpress.TravelExpress.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Utilisateurs implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nom;
    private String prenom;
    private String ville;
}
