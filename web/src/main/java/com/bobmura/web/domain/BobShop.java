package com.bobmura.web.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "bob_shop")
@Getter
@Setter
public class BobShop implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shop_id")
    private Long id;

    @Column(name = "shop_name")
    private String shopName;

    @Column(name = "shop_x")
    private double shopX;

    @Column(name = "shop_y")
    private double shopY;

    @Column(name = "dst_frm_gfc_m")
    private int dstFrmGfcM;

    @Column(name = "reg_date")
    private LocalDateTime regdate;

    @Column(name = "reg_id")
    private String regId;

    @Column(name = "upd_date")
    private LocalDateTime upddate;

    @Column(name = "upd_id")
    private String updId;

}
