package dev.golony.dbapi.pubtrans4watch.subwayinfo.v1.service;

import dev.golony.dbapi.pubtrans4watch.subwayinfo.domain.SubwayLineInfo;
import dev.golony.dbapi.pubtrans4watch.subwayinfo.domain.SubwayLineInfoRepository;
import dev.golony.dbapi.pubtrans4watch.subwayinfo.v1.dto.SubwayLineInfoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class SubwayLineInfoService {
    @Autowired
    private SubwayLineInfoRepository subwayLineInfoRepository;

    public List<SubwayLineInfoDto> getAllSubwayLineInfo(){
        List<SubwayLineInfoDto> dto = new ArrayList<>();

        for (SubwayLineInfo subwayLineInfo: subwayLineInfoRepository.findAll()) {
            SubwayLineInfoDto data = new SubwayLineInfoDto();
            data.from(subwayLineInfo);

            dto.add(data);
        }

        return dto;
    }
}
