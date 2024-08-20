package model;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
@Repository
public class EnderecoRepository extends CrudRepository<Endereco, String> {

}
