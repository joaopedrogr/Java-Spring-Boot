package main.java.com.example.demo.model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import main.java.com.example.demo.model.entities;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

//	findByNomeContaining
//	findByNomeIsContaining
//	findByNomeContains
//	
//	findByNomeStartsWith
//	findByNomeEndsWith
//	
//	findByNomeNotContaining

	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
}
