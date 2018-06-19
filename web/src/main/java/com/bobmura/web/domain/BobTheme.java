package com.bobmura.web.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "bob_theme")
@Getter
@Setter
public class BobTheme implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq")
    private Long id;

    @JsonBackReference
    @ManyToOne(targetEntity = BobMenu.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id")
    private BobMenu bobMenu;

    @Column(name = "theme_type")
    private int themeType;

    @Column(name = "reg_date")
    private LocalDateTime regDate;

    @Column(name = "reg_id")
    private String regId;

    @Column(name = "upd_date")
    private LocalDateTime updDate;

    @Column(name = "upd_id")
    private String updId;
}
