package org.shazhi.businessEnglishMicroCourse.repository;

import org.shazhi.businessEnglishMicroCourse.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.util.List;


public interface UserRepository extends JpaRepository<UserEntity, Integer>, JpaSpecificationExecutor<UserEntity>, Serializable {
    UserEntity getUserEntityByUserName(String userName);

    @Query("select user from UserEntity user where user.userName = :username")
    UserEntity getProfileByUsername(@Param("username") String username);

    List<UserEntity> findUserEntitiesByUserEmail(String userEmail);

    List<UserEntity> findUserEntitiesByUserName(String userName);

}
