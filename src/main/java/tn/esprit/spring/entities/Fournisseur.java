package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Fournisseur implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idFournisseur;
	private String nomFournisseur;
	private String localisation;
	private String mail;
	private Long telephone;
	
	@JsonIgnore
    @ManyToMany(mappedBy="fournisseurs", cascade = CascadeType.ALL)
    private Set<Stock> stocks;
	
	
}
