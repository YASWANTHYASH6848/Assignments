package yaswanth.moviecatalogservice.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import yaswanth.moviecatalogservice.Models.CatalogItem;
import yaswanth.moviecatalogservice.Models.UserRating;
import yaswanth.moviecatalogservice.services.MovieInfo;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    MovieInfo Movieinfo;

    @Autowired
    yaswanth.moviecatalogservice.services.UserRatingInfo UserRatingInfo ;

    @RequestMapping("/{userid}")
    public List<CatalogItem> getCatalog(@PathVariable("userid") String userId) {
        UserRating ratings = UserRatingInfo.getUserRating(userId);
        return ratings.
                getUserRating().
                stream().
                map(rating -> Movieinfo.getCatalogItem(rating))
                .collect(Collectors.toList());
    }

}

