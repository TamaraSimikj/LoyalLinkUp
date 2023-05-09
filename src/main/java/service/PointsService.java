package service;

import model.Points;
import model.dto.PointsDto;

import java.util.List;
import java.util.Optional;

public interface PointsService {

    List<Points> listAll();

    Optional<Points> findById(Long points_id);

    Points create(Long points_id, PointsDto pointsDto);

    Points edit (Long points_id, PointsDto pointsDto);

    Boolean delete (Long points_id);
}
