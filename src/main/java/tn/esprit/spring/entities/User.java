package tn.esprit.spring.entities;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User  implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long iduser;
	private String nomuser;
	private String prenomuser;
	private int telephone;
	private String mail;
	private String password;
	@Enumerated(EnumType.STRING)
	private Personneltype type;
	
	@JsonIgnore
    @ManyToMany(mappedBy="users", cascade = CascadeType.ALL)
    private Set<Produit> produits;
}

