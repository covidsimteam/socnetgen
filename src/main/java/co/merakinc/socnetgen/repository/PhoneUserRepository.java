package co.merakinc.socnetgen.repository;

import co.merakinc.socnetgen.domain.PhoneUser;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "people", path="people")
public interface PhoneUserRepository extends Neo4jRepository<PhoneUser, Long> {
    List<PhoneUser> findByCellNumber(String cellNumberHash);
}
