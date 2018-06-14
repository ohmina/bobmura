package com.bobmura.web.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name="bob_menu")
@Getter
@Setter
public class BobMenu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private Long menuId;

    @Column(name = "menu_name")
    private String menuName;

    @Column(name = "shop_id")
    private String shopId;

    @Column(name = "reg_date")
    private LocalDateTime regdate;

    @Column(name = "reg_id")
    private String regId;

    @Column(name = "upd_date")
    private LocalDateTime upddate;

    @Column(name = "upd_id")
    private String updId;
}
