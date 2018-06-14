package com.bobmura.web.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "bob_spoon")
@Getter
@Setter
public class BobSpoon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spoon_id")
    private Long spoonId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "menu_id")
    private Long menuId;

    @Column(name = "reg_date")
    private LocalDateTime regdate;

    @Column(name = "reg_id")
    private String regId;
}
