package com.bobmura.web.domain;

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

    @Column(name = "menu_id")
    private Long menuId;

    @Column(name = "theme_type")
    private int themeType;

    @Column(name = "reg_date")
    private LocalDateTime regdate;

    @Column(name = "reg_id")
    private String regId;

    @Column(name = "upd_date")
    private LocalDateTime upddate;

    @Column(name = "upd_id")
    private String updId;
}
