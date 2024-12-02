package repository;

import model.Param;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParamRepository  extends JpaRepository<UUID, Param> {
}
