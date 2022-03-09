package api.com.mangas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.com.mangas.entity.Mangas;
import api.com.mangas.repository.IMangaRepository;

@RestController
@RequestMapping("apiMangas/v1")
public class MangasResource {

	@Autowired
	private IMangaRepository mangasRepository;

	@GetMapping("/mangas")

	public List<Mangas> findAll() {

		return mangasRepository.findAll();

	}

	@PostMapping("/manga")
	public Mangas create(@RequestBody Mangas manga) {
		return mangasRepository.save(manga);
	}

	@PutMapping("/manga/{id}")

	public Mangas update(@RequestBody Mangas manga, @PathVariable Integer id) {

		Mangas updateManga = mangasRepository.getById(id);

		
		updateManga.setNombre(manga.getNombre());
		updateManga.setGenero(manga.getGenero());
		updateManga.setCreador(manga.getCreador());
		updateManga.setNumeroDeTomos(manga.getNumeroDeTomos());
		updateManga.setEditorial(manga.getEditorial());
		updateManga.setFechaDeEstreno(manga.getFechaDeEstreno());
		updateManga.setFinalizado(manga.getFinalizado());
		updateManga.setPrecioPorTomos(manga.getPrecioPorTomos());
			

		return mangasRepository.save(updateManga);

	}

	@DeleteMapping("/manga/{id}")

	public void delete(@PathVariable Integer id) {

		mangasRepository.deleteById(id);

	}

}
