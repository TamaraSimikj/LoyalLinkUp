package service;

import model.ClientsEvents;
import model.Review;
import model.dto.ClientsEventsDto;
import model.dto.ReviewDto;

import java.util.List;

public interface ReviewService {

    List<Review> listAll ();
    Review findById(Long id);

    Boolean deleteById(Long id);

    Review editById(Long id, ReviewDto reviewDto);

    Review create(ReviewDto reviewDto);

}
