package com.cg.onlineadvapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlineadvapi.domain.Advertise;
@Repository
public interface AdvertiseRepository extends JpaRepository<Advertise, Integer>{

}
