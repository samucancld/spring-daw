package com.trantorinc.springbootlocaldevdocker.jpa;

import com.trantorinc.springbootlocaldevdocker.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Long> {

}
