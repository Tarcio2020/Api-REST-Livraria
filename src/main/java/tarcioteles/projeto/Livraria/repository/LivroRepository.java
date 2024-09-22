package tarcioteles.projeto.Livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tarcioteles.projeto.Livraria.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
