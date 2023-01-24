
package tn.esprit.spring.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.CascadeType;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Produit implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idproduit;
	private String nomproduit;
	private String discripition;
	private int quantite;
	private String image;
	
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<User> users;
	
	@JsonIgnore
	@ManyToOne
	Stock stocks;
	
	
}
