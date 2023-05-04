package service.impl;

import model.Favorites;
import org.springframework.stereotype.Service;
import repo.FavoritesRepo;
import service.BusinessService;
import service.ClientService;
import service.FavoritesService;

import java.util.List;

@Service
public class FavoritesServiceImpl implements FavoritesService {

    private final FavoritesRepo favoritesRepo;
    private final BusinessService businessService;
    private final ClientService clientService;

    public FavoritesServiceImpl(FavoritesRepo favoritesRepo, BusinessService businessService, ClientService clientService) {
        this.favoritesRepo = favoritesRepo;
        this.businessService = businessService;
        this.clientService = clientService;
    }

    @Override
    public Favorites create(Long business_id, Long client_id) {
        return null;
    }

    @Override
    public Boolean delete(Long favorites_id) {
        return null;
    }

    @Override
    public Favorites edit(Long favorites_id, Long business_id, Long client_id) {
        return null;
    }

    @Override
    public List<Favorites> listAll() {
        return null;
    }

    @Override
    public List<Favorites> listByBusinessId(Long business_id) {
        return null;
    }

    @Override
    public List<Favorites> listByClientId(Long client_id) {
        return null;
    }
}
