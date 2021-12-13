package dev.golony.dbapi.db.log;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Calendar;

@Getter
@NoArgsConstructor
@Entity
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String ip;
    private String deviceId;

    @Column(name = "timestamp", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar timestamp;

    @Builder
    public Log(String ip, String deviceId){
        this.ip = ip;
        this.deviceId = deviceId;
    }
}
