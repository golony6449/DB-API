package dev.golony.dbapi.pubtrans4watch.subwayinfo.dto;

import dev.golony.dbapi.pubtrans4watch.subwayinfo.v1.dto.SubwayLineInfoDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class SubwayLineInfoResponseDto extends ResponseCommon {
    List<SubwayLineInfoDto> subwayLineInfoDto;
}
