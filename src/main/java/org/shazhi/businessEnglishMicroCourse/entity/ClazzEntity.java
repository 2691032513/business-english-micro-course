package org.shazhi.businessEnglishMicroCourse.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clazz", schema = "business_english")
@Data
@Accessors(chain = true)
public class ClazzEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clazzId;
    private String clazzName;
    private Integer clazzDescription;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "batch_id")
    private BatchEntity batch;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "curriculum_id")
    private CurriculumEntity curriculum;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "clazz")
    private List<ClazzUserEntity> clazzUsers;


}
