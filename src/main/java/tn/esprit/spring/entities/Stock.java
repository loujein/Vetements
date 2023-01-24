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
import javax.persistence.OneToMany;

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
public class Stock implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idStock;
	private String nomProduit;
	private String typeProduit;
	private String quantiteProduit;
	private Date dateEntre;
	
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Fournisseur> fournisseurs;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy="stocks")
	private Set<Produit> produit;
}
