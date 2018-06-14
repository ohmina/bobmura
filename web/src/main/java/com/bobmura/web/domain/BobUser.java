package com.bobmura.web.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "bob_user")
@Getter
@Setter
public class BobUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_email")
    private String userEmal;

    @Column(name = "user_pass")
    private String userPass;

    @Column(name = "reg_date")
    private LocalDateTime regdate;

    @Column(name = "reg_id")
    private String regId;

    @Column(name = "upd_date")
    private LocalDateTime upddate;

    @Column(name = "upd_id")
    private String updId;
}
