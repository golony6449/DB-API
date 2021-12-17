package dev.golony.dbapi.pubtrans4watch.subwayinfo.v1.dto;

import dev.golony.dbapi.pubtrans4watch.subwayinfo.domain.SubwayLineInfo;
import lombok.Data;

import java.io.Serializable;

@Data
public class SubwayLineInfoDto implements Serializable {
    private String name;
    private String topisCode;
    private String color;

    public void from(SubwayLineInfo subwayLineInfo){
        this.name = subwayLineInfo.getName();
        this.topisCode = subwayLineInfo.getTopisCode();
        this.color = subwayLineInfo.getColor();
    }
}
