package repo;

import model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Long> {

    List<Review> findAlLByClientId(Long client_id);

    List<Review> findAlLByBusinessId(Long business_id);

    List<Review> findAlLByEventId (Long event_id);
    //dali ke raboti so vakvo ID ili _id ili moze kombinacija od site so or
}
