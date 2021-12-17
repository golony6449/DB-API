package dev.golony.dbapi.pubtrans4watch.subwayinfo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
public class SubwayLineInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "line_name")
    private String name;

    @Column(name = "topis_code")
    private String topisCode;

    @Column(name = "color")
    private String color;

    @Builder
    public SubwayLineInfo(String name, String topisCode, String color){
        this.name = name;
        this.topisCode = topisCode;
        this.color = color;
    }
}
