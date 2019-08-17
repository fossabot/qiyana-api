package ca.softwarespace.qiyanna.backend.services;

import ca.softwarespace.qiyanna.backend.models.AggregatedChampionDao;
import ca.softwarespace.qiyanna.backend.models.AggregatedChampionDto;
import ca.softwarespace.qiyanna.backend.repositories.AggregatedChampionRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class ChampionService {

  private final AggregatedChampionRepository aggregatedChampionRepository;

  public List<AggregatedChampionDto> getAggregatedChampionsBySummoner(String summonerName) {
    List<AggregatedChampionDao> aggregatedChampionDaos = aggregatedChampionRepository.getAggregatedChampionsBySummoner(summonerName);
    return AggregatedChampionDto.from(aggregatedChampionDaos);
  }

}