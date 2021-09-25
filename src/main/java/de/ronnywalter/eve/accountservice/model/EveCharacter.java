package de.ronnywalter.eve.accountservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.tomcat.jni.Local;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;


@Getter
@Setter
@Entity
@ToString
public class EveCharacter {
    @Id
    private Integer id;
    private String name;
    private String clientId;
    private ZonedDateTime expiryDate;
    private String refreshToken;
    @Column(length = 10000)
    private String accessToken;
}
