package ca.softwarespace.qiyanna.backend.repositories;

import ca.softwarespace.qiyanna.backend.models.AggregatedChampionDao;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class AggregatedChampionRepository {

  private final MongoTemplate mongoTemplate;

  public List<AggregatedChampionDao> getAggregatedChampionsBySummoner(String summonerName) {
    return mongoTemplate.findAll(AggregatedChampionDao.class);
  }

}
