package service;

import model.Points;
import model.dto.PointsDto;

import java.util.List;

public interface PointsService {

    List<Points> listAll();

    Points findById(Long points_id);

    Points create(Long points_id, PointsDto pointsDto);

    Points edit (Long points_id, PointsDto pointsDto);

    Boolean delete (Long points_id);
}
