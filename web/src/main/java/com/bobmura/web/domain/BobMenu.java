package com.bobmura.web.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

    @Column(name = "menu_price")
    private int menuPrice;

    @JsonBackReference
    @ManyToOne(targetEntity = BobShop.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "shop_id")
    private BobShop bobShop;

    @JsonManagedReference
    @OneToMany(mappedBy = "bobMenu")
    List<BobTheme> bobThemes = new ArrayList<>();

    @JsonManagedReference
    @OneToMany(mappedBy = "bobMenu")
    List<BobSpoon> bobSpoons = new ArrayList<>();

    @JsonManagedReference
    @OneToMany(mappedBy = "bobMenu")
    List<BobTag> bobTags = new ArrayList<>();

    @Column(name = "reg_date")
    private LocalDateTime regDate;

    @Column(name = "reg_id")
    private String regId;

    @Column(name = "upd_date")
    private LocalDateTime updDate;

    @Column(name = "upd_id")
    private String updId;
}
