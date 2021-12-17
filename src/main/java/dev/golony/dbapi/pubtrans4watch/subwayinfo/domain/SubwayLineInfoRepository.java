package dev.golony.dbapi.pubtrans4watch.subwayinfo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubwayLineInfoRepository extends JpaRepository<SubwayLineInfo, Long> {
}