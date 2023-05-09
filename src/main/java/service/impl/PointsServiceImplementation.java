package service.impl;

import model.*;
import model.dto.PointsDto;
import model.exceptions.InvalidBusinessIdException;
import repo.BusinessRepo;
import repo.ClientRepo;
import repo.PointsRepo;
import service.PointsService;

import java.util.List;
import java.util.Optional;

public class PointsServiceImplementation implements PointsService
{

    private final PointsRepo pointsRepo;
    private final BusinessServiceImpl businessService;
    private final ClientServiceImpl clientService;

    public PointsServiceImplementation(PointsRepo pointsRepo, BusinessRepo businessRepo, ClientRepo clientRepo, ClientRepo clientRepo1, BusinessRepo businessRepo1, BusinessServiceImpl businessService, ClientServiceImpl clientService) {
        this.pointsRepo = pointsRepo;
        this.businessService = businessService;
        this.clientService = clientService;
    }

    @Override
    public List<Points> listAll() {
        return this.pointsRepo.findAll();
    }

    @Override
    public Optional<Points> findById(Long points_id) {
        return this.pointsRepo.findById(points_id);
    }

    @Override
    public Points create(Long points_id, PointsDto pointsDto) {

        Client client = this.clientService.findById(pointsDto.getClient_id()).get();
        Business business = this.businessService.findById(pointsDto.getBusiness_id()).get();

        Points points = new Points(points_id, pointsDto.getLoyal_points(), pointsDto.getLoyal_awards(), client, business);
        return this.pointsRepo.save(points);
    }

    @Override
    public Points edit(Long points_id, PointsDto pointsDto) {

        Points points = this.pointsRepo.findById(points_id).get();
        Client client = this.clientService.findById(pointsDto.getClient_id()).get();
        Business business = this.businessService.findById(pointsDto.getBusiness_id()).get();

        points.setPoints_id(points_id);
        points.setLoyal_points(pointsDto.getLoyal_points());
        points.setLoyal_awards(points.getLoyal_awards());
        points.setBusiness(points.getBusiness());
        points.setClient(points.getClient());


        return this.pointsRepo.save(points);
    }

    @Override
    public Optional<Points> delete(Long points_id) {

        Optional<Points> points = this.findById(points_id);
        this.pointsRepo.delete(points);
        return points;
    }
}
