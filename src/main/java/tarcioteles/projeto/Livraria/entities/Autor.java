package tarcioteles.projeto.Livraria.entities;

import java.io.Serializable;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor

@EqualsAndHashCode(of = "id")

@Entity
@Table(name = "tb_autor")
public class Autor implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @JsonIgnore
    @OneToMany(mappedBy = "autor")
    private ArrayList<Livro> livros = new ArrayList<>();
   
    public Autor(Long id, String nome) {
    	super();
    	this.id = id;
    	this.nome = nome;
    }

	
    }
}