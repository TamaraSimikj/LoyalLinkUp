package repo;

import model.Points;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointsRepo extends JpaRepository<Points, Long> {
}
