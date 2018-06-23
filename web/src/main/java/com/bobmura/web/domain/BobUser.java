package com.bobmura.web.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
    private String userEmail;

    @Column(name = "user_pass")
    private String userPass;

    @JsonManagedReference
    @OneToMany(mappedBy = "bobUser")
    List<BobTag> bobTags = new ArrayList<>();

    @JsonManagedReference
    @OneToMany(mappedBy = "bobUser")
    List<BobSpoon> bobSpoons = new ArrayList<>();

    @Column(name = "reg_date")
    private LocalDateTime regDate;

    @Column(name = "reg_id")
    private String regId;

    @Column(name = "upd_date")
    private LocalDateTime updDate;

    @Column(name = "upd_id")
    private String updId;
}
