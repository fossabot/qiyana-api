package ca.softwarespace.qiyanna.backend.models;

import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AggregatedChampionDto {

  private String accountId;
  private String name;

  private int played;
  private int wins;
  private int losses;
  private double winrate;

  private double averageKills;
  private double averageDeaths;
  private double averageAssists;
  private double averageCs;
  private double averageGold;
  private double averageCsPerMin;

  public static AggregatedChampionDto from(AggregatedChampionDao aggregatedChampionDao) {
    return AggregatedChampionDto.builder()
        .accountId(aggregatedChampionDao.getAccountId())
        .name(aggregatedChampionDao.getName())
        .played(aggregatedChampionDao.getPlayed())
        .wins(aggregatedChampionDao.getWins())
        .losses(aggregatedChampionDao.getLosses())
        .winrate(aggregatedChampionDao.getWinrate())
        .averageKills(aggregatedChampionDao.getAverageKills())
        .averageDeaths(aggregatedChampionDao.getAverageDeaths())
        .averageAssists(aggregatedChampionDao.getAverageAssists())
        .averageCs(aggregatedChampionDao.getAverageCs())
        .averageGold(aggregatedChampionDao.getAverageGold())
        .averageCsPerMin(aggregatedChampionDao.getAverageCsPerMin())
        .build();
  }

  public static List<AggregatedChampionDto> from(List<AggregatedChampionDao> aggregatedChampionDaos) {
    return aggregatedChampionDaos.stream().map(AggregatedChampionDto::from).collect(Collectors.toList());
  }

}
