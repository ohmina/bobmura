package com.bobmura.web.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

    @JsonBackReference
    @ManyToOne(targetEntity = BobUser.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private BobUser bobUser;

    @JsonBackReference
    @ManyToOne(targetEntity = BobMenu.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id")
    private BobMenu bobMenu;

    @Column(name = "reg_date")
    private LocalDateTime regDate;

    @Column(name = "reg_id")
    private String regId;
}
