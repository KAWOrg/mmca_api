package kaw.levelup.mmca.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kaw.levelup.mmca.admin.data.entitiy.Program;

@Repository
public interface ProgramInfoRepository extends JpaRepository<Program, String>{

}
