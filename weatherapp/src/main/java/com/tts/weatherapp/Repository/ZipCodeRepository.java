package com.tts.weatherapp.Repository;

import com.tts.weatherapp.Model.ZipCode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZipCodeRepository extends CrudRepository<ZipCode, Long> {

}
