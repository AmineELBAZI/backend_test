package com.example.test.Service;

import com.example.test.Dao.TerrainRepository;
import com.example.test.entities.Terrain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TerrainService {
	
	@Autowired
	TerrainRepository terrainRepository;

	public <S extends Terrain> S save(S entity) {
		return terrainRepository.save(entity);
	}

	public List<Terrain> findAll() {
		return terrainRepository.findAll();
	}

	public Optional<Terrain> findById(Integer id) {
		return terrainRepository.findById(id);
	}

	public void deleteById(Integer id) {
		terrainRepository.deleteById(id);
	}
	
	public List<Object[]> getNomByTerrainId(int terrainId) {
        return terrainRepository.getNomByTerrainId(terrainId);
    }
	
	public List<Object[]> getTypeByTerrainId(int terrainId){
		return terrainRepository.getTypeByTerrainId(terrainId);
	}
	
	
}
