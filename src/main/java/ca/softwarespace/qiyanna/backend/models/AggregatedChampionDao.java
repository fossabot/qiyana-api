package ca.softwarespace.qiyanna.backend.models;

import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AggregatedChampionDao {

  @Id
  private String id;
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

  public static AggregatedChampionDao from(AggregatedChampionDto aggregatedChampionDto) {
    return AggregatedChampionDao.builder()
        .accountId(aggregatedChampionDto.getAccountId())
        .name(aggregatedChampionDto.getName())
        .played(aggregatedChampionDto.getPlayed())
        .wins(aggregatedChampionDto.getWins())
        .losses(aggregatedChampionDto.getLosses())
        .winrate(aggregatedChampionDto.getWinrate())
        .averageKills(aggregatedChampionDto.getAverageKills())
        .averageDeaths(aggregatedChampionDto.getAverageDeaths())
        .averageAssists(aggregatedChampionDto.getAverageAssists())
        .averageCs(aggregatedChampionDto.getAverageCs())
        .averageGold(aggregatedChampionDto.getAverageGold())
        .averageCsPerMin(aggregatedChampionDto.getAverageCsPerMin())
        .build();
  }

  public static List<AggregatedChampionDao> from(List<AggregatedChampionDto> aggregatedChampionDtos) {
    return aggregatedChampionDtos.stream().map(AggregatedChampionDao::from).collect(Collectors.toList());
  }

}
