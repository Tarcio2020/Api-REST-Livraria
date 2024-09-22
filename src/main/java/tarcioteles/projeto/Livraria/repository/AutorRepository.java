package tarcioteles.projeto.Livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tarcioteles.projeto.Livraria.entities.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}