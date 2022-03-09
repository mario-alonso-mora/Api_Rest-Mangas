package api.com.mangas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.com.mangas.entity.Mangas;


@Repository
public interface IMangaRepository extends JpaRepository<Mangas, Integer> {

}
