package com.example.muumi.model;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MuumiRepository extends CrudRepository <Muumi,Long>{
	List<Muumi> findByNimi(String nimi);

}
