package org.shazhi.businessEnglishMicroCourse.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clazz_user")
@Data
@Accessors(chain = true)
public class ClazzUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clazzUserId;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "clazz_id")
    private ClazzEntity clazz;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "clazzUser")
    private List<ProgressEntity> progresses;

}
