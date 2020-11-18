package maurizio.franco.spring5.angularjs.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import maurizio.franco.spring5.angularjs.demo.entity.UserDTO;
@Repository
public interface UserJpaRepository extends JpaRepository<UserDTO, Long> {
UserDTO findByName(String name);
}
